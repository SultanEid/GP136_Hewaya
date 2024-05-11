package com.hewayah.hello_world.repository;

import com.hewayah.hello_world.entity.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceProviderRepository extends UserRepository {
    // Add custom methods specific to the ServiceProvider entity if needed
}