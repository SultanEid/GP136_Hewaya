package com.hewayah.hello_world.service;
import com.hewayah.hello_world.entity.BillEntity;
import com.hewayah.hello_world.repository.BillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillDao {

    @Autowired
    private BillRepo billRepo ;
    public BillEntity saveBill(BillEntity billEntity) {
        return this.billRepo.save(billEntity);
    }

    public Optional<BillEntity> getBillById(Integer billId) {
        return this.billRepo.findById(billId);
    }

    public List<BillEntity> getAllBills() {
        return this.billRepo.findAll();
    }

    public void deleteBill(Integer billId) {
        this.billRepo.deleteById(billId);
    }
}
