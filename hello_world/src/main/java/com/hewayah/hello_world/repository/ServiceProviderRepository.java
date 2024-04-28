package com.hewayah.hello_world.repository;

import com.hewayah.hello_world.model.entity.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceProviderRepository extends JpaRepository<ServiceProvider,Long> {
//    ServiceProvider findByServiceProviderUsername(String username);
//    void deleteByServiceProviderUsername(String username);
}
