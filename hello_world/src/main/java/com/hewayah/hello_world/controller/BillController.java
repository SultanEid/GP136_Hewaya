package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.model.dto.BillDTO;
import com.hewayah.hello_world.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bills")
public class BillController {

    private final BillService billService;

    @Autowired
    public BillController(BillService billService) {
        this.billService = billService;
    }

    @PostMapping
    public ResponseEntity<BillDTO> createBill(@RequestBody @Validated BillDTO billDTO) {
        BillDTO createdBill = billService.createBill(billDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBill);
    }

    @GetMapping("/{billId}")
    public ResponseEntity<BillDTO> getBillById(@PathVariable Integer billId) {
        BillDTO bill = billService.getBillById(billId);
        return ResponseEntity.ok(bill);
    }

    // Other endpoints...
}