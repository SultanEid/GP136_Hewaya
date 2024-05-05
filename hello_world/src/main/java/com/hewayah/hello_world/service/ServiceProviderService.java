package com.hewayah.hello_world.service;

import com.hewayah.hello_world.entity.ServiceProvider;
import com.hewayah.hello_world.repository.ServiceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceProviderService {
    private final ServiceProviderRepository serviceProviderRepository;

    @Autowired
    public ServiceProviderService(ServiceProviderRepository serviceProviderRepository) {
        this.serviceProviderRepository = serviceProviderRepository;
    }

    public List<ServiceProvider> getAllServiceProviders() {
        return serviceProviderRepository.findAll();
    }

    public Optional<ServiceProvider> getServiceProviderById(Long id) {
        return serviceProviderRepository.findById(id);
    }

    public ServiceProvider saveServiceProvider(ServiceProvider serviceProvider) {
        return serviceProviderRepository.save(serviceProvider);
    }

    public void updateServiceProvider(Long id, ServiceProvider updatedServiceProvider) {
        Optional<ServiceProvider> serviceProvider = serviceProviderRepository.findById(id);
        serviceProvider.ifPresent(existingServiceProvider -> {
            existingServiceProvider.setServiceProviderUsername(updatedServiceProvider.getServiceProviderUsername());
            existingServiceProvider.setBio(updatedServiceProvider.getBio());
            existingServiceProvider.setPassword(updatedServiceProvider.getPassword());
            existingServiceProvider.setEmail(updatedServiceProvider.getEmail());
            existingServiceProvider.setDateCreate(updatedServiceProvider.getDateCreate());
            existingServiceProvider.setDateUpdate(updatedServiceProvider.getDateUpdate());
            existingServiceProvider.setPhoneNumber(updatedServiceProvider.getPhoneNumber());
            existingServiceProvider.setServiceProviderName(updatedServiceProvider.getServiceProviderName());
            serviceProviderRepository.save(existingServiceProvider);
        });
    }

    public void deleteServiceProvider(Long id) {
        serviceProviderRepository.deleteById(id);
    }
}