package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.entity.ServiceProviderEntity;
import com.hewayah.hello_world.service.ServiceProviderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ServiceProviderController {

    @Autowired
    private ServiceProviderDao serviceProviderDao;



    @PostMapping("/createServiceProvider")
    public ServiceProviderEntity createServiceProvider(@RequestBody ServiceProviderEntity serviceProvider) {
        return serviceProviderDao.createServiceProvider(serviceProvider);
    }

    @GetMapping("/getAllServiceProviders")
    public List<ServiceProviderEntity> getAllServiceProviders() {
        return serviceProviderDao.getAllServiceProviders();
    }

    @DeleteMapping("/deleteServiceProviderByUsername/{username}")
    public void deleteServiceProviderByUsername(@PathVariable String username) {
        serviceProviderDao.deleteByServiceProviderUsername(username);
    }

    @PutMapping("/updateServiceProvider/{username}")
    public ServiceProviderEntity updateServiceProvider(@PathVariable String username, @RequestBody ServiceProviderEntity serviceProvider) {
        return serviceProviderDao.updateServiceProvider(username, serviceProvider);
    }

    @GetMapping("/getServiceProvidersByUsername/{username}")
    public ServiceProviderEntity getServiceProvidersByUsername(@PathVariable String username) {
        return serviceProviderDao.getServiceProvidersByUsername(username);
    }
}
