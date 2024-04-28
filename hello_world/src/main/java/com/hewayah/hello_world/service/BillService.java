package com.hewayah.hello_world.service;

import com.hewayah.hello_world.model.dto.BillDTO;

public interface BillService {

    BillDTO createBill(BillDTO billDTO);

    BillDTO getBillById(Integer billId);

    // Other methods...
}