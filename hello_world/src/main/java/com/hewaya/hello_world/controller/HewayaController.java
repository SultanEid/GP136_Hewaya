package com.hewaya.hello_world.controller;


import com.hewaya.hello_world.service.HewayaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("Hobbyist")
public class HewayaController {
    //object from HewayaService

    HewayaService hewayaService;


    @GetMapping("Login")
    public ResponseEntity user(){
       return ResponseEntity.ok(hewayaService);
    }

}
