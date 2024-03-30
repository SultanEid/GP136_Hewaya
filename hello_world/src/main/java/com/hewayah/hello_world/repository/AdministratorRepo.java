package com.hewayah.hello_world.repository;
import com.hewayah.hello_world.entity.AdministratorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorRepo extends JpaRepository<AdministratorEntity,String> {
}
