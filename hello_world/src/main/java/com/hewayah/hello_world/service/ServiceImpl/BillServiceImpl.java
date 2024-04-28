package com.hewayah.hello_world.service.ServiceImpl;

import com.hewayah.hello_world.model.dto.BillDTO;
import com.hewayah.hello_world.model.mapper.BillMapper;
import com.hewayah.hello_world.model.entity.Bill;
import com.hewayah.hello_world.repository.BillRepository;
import com.hewayah.hello_world.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl implements BillService {

    private final BillRepository billRepository;
    private final BillMapper billMapper;

    @Autowired
    public BillServiceImpl(BillRepository billRepository, BillMapper billMapper) {
        this.billRepository = billRepository;
        this.billMapper = billMapper;
    }

    @Override
    public BillDTO createBill(BillDTO billDTO) {
        Bill bill = billMapper.toBill(billDTO);
        Bill savedBill = billRepository.save(bill);
        return billMapper.toBillDTO(savedBill);
    }

    @Override
    public BillDTO getBillById(Integer billId) {
        Bill bill = billRepository.findById(billId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid billId"));
        return billMapper.toBillDTO(bill);
    }

    // Other method implementations...
}