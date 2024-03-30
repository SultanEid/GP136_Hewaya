package com.hewayah.hello_world.service;

import com.hewayah.hello_world.entity.ServiceProviderEntity;
import com.hewayah.hello_world.repository.ServiceProviderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceProviderDao {



    @Autowired
    private ServiceProviderRepo serviceProviderRepo;

    public ServiceProviderEntity createServiceProvider(ServiceProviderEntity serviceProvider) {
        return serviceProviderRepo.save(serviceProvider);
    }


    public List<ServiceProviderEntity> getAllServiceProviders() {
        return serviceProviderRepo.findAll();
    }

    public void deleteByServiceProviderUsername(String username) {
        serviceProviderRepo.deleteByServiceProviderUsername(username);
    }

    public ServiceProviderEntity updateServiceProvider(String username, ServiceProviderEntity serviceProvider) {
        Optional<ServiceProviderEntity> existingServiceProvider = Optional.ofNullable(serviceProviderRepo.findByServiceProviderUsername(username));
        if (existingServiceProvider.isPresent()) {
            ServiceProviderEntity serviceProviderToUpdate = existingServiceProvider.get();
            serviceProviderToUpdate.setServiceProviderUsername(serviceProvider.getServiceProviderUsername());
            serviceProviderToUpdate.setBio(serviceProvider.getBio());
            // Update other fields as needed
            return serviceProviderRepo.save(serviceProviderToUpdate);
        }
        return null;
    }

    public ServiceProviderEntity getServiceProvidersByUsername(String username) {
        return serviceProviderRepo.findByServiceProviderUsername(username);
    }


}
