package com.hewayah.hello_world.service.ServiceImpl;

import com.hewayah.hello_world.model.dto.ServiceProviderDTO;
import com.hewayah.hello_world.model.entity.ServiceProvider;
import com.hewayah.hello_world.model.mapper.ServiceProviderMapper;
import com.hewayah.hello_world.repository.ServiceProviderRepository;

import com.hewayah.hello_world.service.ServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ServiceProviderServiceImpl implements ServiceProviderService {
    private final ServiceProviderRepository serviceProviderRepository;
    private final ServiceProviderMapper serviceProviderMapper;

    @Autowired
    public ServiceProviderServiceImpl(ServiceProviderRepository serviceProviderRepository, ServiceProviderMapper serviceProviderMapper) {
        this.serviceProviderRepository = serviceProviderRepository;
        this.serviceProviderMapper = serviceProviderMapper;
    }

    @Override
    public ServiceProviderDTO createServiceProvider(ServiceProviderDTO serviceProviderDTO) {
        ServiceProvider serviceProvider = serviceProviderMapper.toEntity(serviceProviderDTO);
        ServiceProvider savedServiceProvider = serviceProviderRepository.save(serviceProvider);
        return serviceProviderMapper.toDTO(savedServiceProvider);
    }

    @Override
    public ServiceProviderDTO updateServiceProvider(Long id, ServiceProviderDTO serviceProviderDTO) {
        Optional<ServiceProvider> optionalServiceProvider = serviceProviderRepository.findById(id);
        if (optionalServiceProvider.isPresent()) {
            ServiceProvider serviceProvider = optionalServiceProvider.get();
            serviceProvider.setServiceProviderUsername(serviceProviderDTO.getServiceProviderUsername());
            serviceProvider.setBio(serviceProviderDTO.getBio());
            serviceProvider.setPassword(serviceProviderDTO.getPassword());
            serviceProvider.setEmail(serviceProviderDTO.getEmail());
            serviceProvider.setPhoneNumber(serviceProviderDTO.getPhoneNumber());
            serviceProvider.setServiceProviderName(serviceProviderDTO.getServiceProviderName());

            ServiceProvider updatedServiceProvider = serviceProviderRepository.save(serviceProvider);
            return serviceProviderMapper.toDTO(updatedServiceProvider);
        }
        return null;
    }

    @Override
    public void deleteServiceProvider(Long id) {
        serviceProviderRepository.deleteById(id);
    }

    @Override
    public ServiceProviderDTO getServiceProviderById(Long id) {
        Optional<ServiceProvider> optionalServiceProvider = serviceProviderRepository.findById(id);
        return optionalServiceProvider.map(serviceProviderMapper::toDTO).orElse(null);
    }

    @Override
    public List<ServiceProviderDTO> getAllServiceProviders() {
        List<ServiceProvider> serviceProviders = serviceProviderRepository.findAll();
        return serviceProviders.stream()
                .map(serviceProviderMapper::toDTO)
                .collect(Collectors.toList());
    }
}