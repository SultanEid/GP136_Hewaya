package com.hewayah.hello_world.controller;


import com.hewayah.hello_world.entity.AdministratorEntity;
import com.hewayah.hello_world.service.AdministratorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class AdministratorController {

    @Autowired
    private AdministratorDao administratorDao ;
    @GetMapping(path = "/getAllAdministrators")
    public List<AdministratorEntity> getAllAdministrators() {
        return administratorDao.getAllAdministrators();
    }

    @GetMapping("/getAdministratorByUsername/{username}")
    public ResponseEntity<AdministratorEntity> getAdministratorByUsername(@PathVariable String username) {
        Optional<AdministratorEntity> administrator = administratorDao.getAdministratorByUsername(username);

        if (administrator.isPresent()) {
            return ResponseEntity.ok(administrator.get());
        } else {
            return ResponseEntity.notFound().build();
        }
  }
//    The method returns a ResponseEntity to provide a more appropriate HTTP response.
//    If the administrator is found in the database (administrator.isPresent() is true),
//    the method returns a response with a status code of 200 OK and the administrator entity in the response body using ResponseEntity.
//        ok(administrator.get()). If the administrator is not found,
//    it returns a response with a status code of 404 Not Found using ResponseEntity.notFound().build().
//

    @PostMapping("/createAdministrator")
    public AdministratorEntity createAdministrator(@RequestBody AdministratorEntity administrator) {
        return administratorDao.createAdministrator(administrator);
    }

    @DeleteMapping("/deleteAdministrator")//delete mapping ******
    public void deleteAdministrator( String username){
        this.administratorDao.deleteAdministrator(username);
    }
}

