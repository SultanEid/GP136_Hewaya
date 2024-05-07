//package com.hewayah.hello_world.controller;
//
//import com.hewayah.hello_world.entity.Administrator;
//import com.hewayah.hello_world.service.AdministratorService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/administrators")
//public class AdministratorController {
//    private final AdministratorService administratorService;
//
//    @Autowired
//    public AdministratorController(AdministratorService administratorService) {
//        this.administratorService = administratorService;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Administrator>> getAllAdministrators() {
//        List<Administrator> administrators = administratorService.getAllAdministrators();
//        return ResponseEntity.ok(administrators);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Administrator> getAdministratorById(@PathVariable Long id) {
//        Optional<Administrator> administrator = administratorService.getAdministratorById(id);
//        return administrator.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
//    }
//
//    @PostMapping
//    public ResponseEntity<Administrator> createAdministrator(@Valid @RequestBody Administrator administrator) {
//        Administrator createdAdministrator = administratorService.createAdministrator(administrator);
//        return ResponseEntity.status(HttpStatus.CREATED).body(createdAdministrator);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Void> updateAdministrator(@PathVariable Long id, @Validated @RequestBody Administrator updatedAdministrator) {
//        administratorService.updateAdministrator(id, updatedAdministrator);
//        return ResponseEntity.noContent().build();
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteAdministrator(@PathVariable Long id) {
//        administratorService.deleteAdministrator(id);
//        return ResponseEntity.noContent().build();
//    }
//}