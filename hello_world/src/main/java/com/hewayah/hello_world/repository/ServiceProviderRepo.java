package com.hewayah.hello_world.repository;

import com.hewayah.hello_world.entity.ServiceProviderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceProviderRepo extends JpaRepository<ServiceProviderEntity,String> {
    ServiceProviderEntity findByServiceProviderUsername(String username);
    void deleteByServiceProviderUsername(String username);
}
