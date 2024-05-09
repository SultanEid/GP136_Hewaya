package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.entity.ServiceProvider;
import com.hewayah.hello_world.service.ServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/service-providers")
public class ServiceProviderController {

    private final ServiceProviderService serviceProviderService;

    @Autowired
    public ServiceProviderController(ServiceProviderService serviceProviderService) {
        this.serviceProviderService = serviceProviderService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiceProvider> getServiceProviderById(@PathVariable Long id) {
        Optional<ServiceProvider> serviceProvider = serviceProviderService.getServiceProviderById(id);
        return serviceProvider.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<ServiceProvider>> getAllServiceProviders() {
        List<ServiceProvider> serviceProviders = serviceProviderService.getAllServiceProviders();
        return ResponseEntity.ok(serviceProviders);
    }

    @PostMapping
    public ResponseEntity<ServiceProvider> createServiceProvider(@RequestBody @Valid ServiceProvider serviceProvider) {
        ServiceProvider createdServiceProvider = serviceProviderService.createServiceProvider(serviceProvider);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdServiceProvider);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ServiceProvider> updateServiceProvider(@PathVariable Long id, @RequestBody @Valid ServiceProvider serviceProvider) {
        ServiceProvider updatedServiceProvider = serviceProviderService.updateServiceProvider(id, serviceProvider);
        return ResponseEntity.ok(updatedServiceProvider);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteServiceProvider(@PathVariable Long id) {
        serviceProviderService.deleteServiceProvider(id);
        return ResponseEntity.noContent().build();
    }
}