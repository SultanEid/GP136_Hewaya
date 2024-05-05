package com.hewayah.hello_world.service;

import com.hewayah.hello_world.entity.Bill;
import com.hewayah.hello_world.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillService {
    private final BillRepository billRepository;

    @Autowired
    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public List<Bill> getAllBills() {
        return billRepository.findAll();
    }

    public Optional<Bill> getBillById(Integer billId) {
        return billRepository.findById(billId);
    }

    public Bill createBill(Bill bill) {
        return billRepository.save(bill);
    }

    public void updateBill(Integer billId, Bill updatedBill) {
        Optional<Bill> existingBill = billRepository.findById(billId);
        existingBill.ifPresent(bill -> {
            bill.setTime(updatedBill.getTime());
            bill.setEventId(updatedBill.getEventId());
            bill.setPay(updatedBill.isPay());
            billRepository.save(bill);
        });
    }

    public void deleteBill(Integer billId) {
        billRepository.deleteById(billId);
    }
}