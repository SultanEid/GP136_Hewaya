package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.model.dto.ServiceProviderDTO;
import com.hewayah.hello_world.service.ServiceProviderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service-providers")
public class ServiceProviderController {
    private final ServiceProviderService serviceProviderService;

    @Autowired
    public ServiceProviderController(ServiceProviderService serviceProviderService) {
        this.serviceProviderService = serviceProviderService;
    }

    @PostMapping
    public ServiceProviderDTO createServiceProvider(@RequestBody ServiceProviderDTO serviceProviderDTO) {
        return serviceProviderService.createServiceProvider(serviceProviderDTO);
    }

    @PutMapping("/{id}")
    public ServiceProviderDTO updateServiceProvider(@PathVariable Long id, @RequestBody ServiceProviderDTO serviceProviderDTO) {
        return serviceProviderService.updateServiceProvider(id, serviceProviderDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteServiceProvider(@PathVariable Long id) {
        serviceProviderService.deleteServiceProvider(id);
    }

    @GetMapping("/{id}")
    public ServiceProviderDTO getServiceProviderById(@PathVariable Long id) {
        return serviceProviderService.getServiceProviderById(id);
    }

    @GetMapping
    public List<ServiceProviderDTO> getAllServiceProviders() {
        return serviceProviderService.getAllServiceProviders();
    }
}