package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.entity.BillEntity;
import com.hewayah.hello_world.service.BillDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BillController {



    @Autowired
    private BillDao billDao ;

    @PostMapping("createBill")
    public BillEntity createBill(@RequestBody BillEntity billEntity) {
        return billDao.saveBill(billEntity);

    }

    @GetMapping("/{billId}")
    public Optional<BillEntity> getBillById(@PathVariable Integer billId) {
        return billDao.getBillById(billId);

    }

    @GetMapping("getAllBill")
    public ResponseEntity<List<BillEntity>> getAllBill() {
        List<BillEntity> bills = billDao.getAllBills();
        return ResponseEntity.ok(bills);
    }

    @DeleteMapping("deleteBill/{billId}")
    public ResponseEntity<Void> deleteBill(@PathVariable Integer billId) {
        billDao.deleteBill(billId);
        return ResponseEntity.noContent().build();
    }
}
