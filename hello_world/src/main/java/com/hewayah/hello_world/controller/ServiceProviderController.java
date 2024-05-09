package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.entity.ServiceProvider;
import com.hewayah.hello_world.service.ServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:3000")
public class ServiceProviderController {
    private final ServiceProviderService serviceProviderService;

    @Autowired
    public ServiceProviderController(ServiceProviderService serviceProviderService) {
        this.serviceProviderService = serviceProviderService;
    }

    @GetMapping("getAllServiceProviders")
    public ResponseEntity<List<ServiceProvider>> getAllServiceProviders() {
        List<ServiceProvider> serviceProviders = serviceProviderService.getAllServiceProviders();
        return ResponseEntity.ok(serviceProviders);
    }

    @GetMapping("ServiceProvider/{id}")
    public ResponseEntity<ServiceProvider> getServiceProviderById(@PathVariable Long id) {
        Optional<ServiceProvider> serviceProvider = serviceProviderService.getServiceProviderById(id);
        return serviceProvider.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("ServiceProvider")
    public ResponseEntity<ServiceProvider> createServiceProvider(@RequestBody ServiceProvider serviceProvider) {
        ServiceProvider savedServiceProvider = serviceProviderService.saveServiceProvider(serviceProvider);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedServiceProvider);
    }

    @PutMapping("ServiceProvider/{id}")
    public ResponseEntity<Void> updateServiceProvider(
            @PathVariable Long id,
            @RequestBody ServiceProvider updatedServiceProvider
    ) {
        serviceProviderService.updateServiceProvider(id, updatedServiceProvider);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("ServiceProvider/{id}")
    public ResponseEntity<Void> deleteServiceProvider(@PathVariable Long id) {
        serviceProviderService.deleteServiceProvider(id);
        return ResponseEntity.noContent().build();
    }
}