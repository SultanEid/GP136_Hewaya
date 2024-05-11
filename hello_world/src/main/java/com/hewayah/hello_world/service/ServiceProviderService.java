package com.hewayah.hello_world.service;

import com.hewayah.hello_world.entity.ServiceProvider;
import com.hewayah.hello_world.entity.User;
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

    public Optional<User> getServiceProviderById(Long id) {
        return serviceProviderRepository.findById(id);
    }

    public List<User> getAllServiceProviders() {
        return serviceProviderRepository.findAll();
    }

    public ServiceProvider createServiceProvider(ServiceProvider serviceProvider) {
        return serviceProviderRepository.save(serviceProvider);
    }

    public ServiceProvider updateServiceProvider(Long id, ServiceProvider updatedServiceProvider) {
        Optional<User> existingServiceProvider = serviceProviderRepository.findById(id);
        if (existingServiceProvider.isPresent()) {
            ServiceProvider serviceProvider = (ServiceProvider) existingServiceProvider.get();
            serviceProvider.setUsername(updatedServiceProvider.getUsername());
            serviceProvider.setPassword(updatedServiceProvider.getPassword());
            serviceProvider.setEmail(updatedServiceProvider.getEmail());
            serviceProvider.setPhoneNumber(updatedServiceProvider.getPhoneNumber());
            serviceProvider.setUserType(updatedServiceProvider.getUserType());
            serviceProvider.setName(updatedServiceProvider.getName());
            serviceProvider.setBio(updatedServiceProvider.getBio());
            serviceProvider.setGender(updatedServiceProvider.getGender());
            // Update additional fields specific to ServiceProvider entity

            return serviceProviderRepository.save(serviceProvider);
        } else {
            throw new IllegalArgumentException("ServiceProvider with ID " + id + " not found");
        }
    }

    public void deleteServiceProvider(Long id) {
        serviceProviderRepository.deleteById(id);
    }
}