package com.hewayah.hello_world.service;

import com.hewayah.hello_world.model.dto.ServiceProviderDTO;

import java.util.List;

public interface ServiceProviderService {
    ServiceProviderDTO createServiceProvider(ServiceProviderDTO serviceProviderDTO);

    ServiceProviderDTO updateServiceProvider(Long id, ServiceProviderDTO serviceProviderDTO);

    void deleteServiceProvider(Long id);

    ServiceProviderDTO getServiceProviderById(Long id);

    List<ServiceProviderDTO> getAllServiceProviders();
}