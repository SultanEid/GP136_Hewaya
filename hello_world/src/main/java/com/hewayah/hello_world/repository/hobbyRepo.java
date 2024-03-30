package com.hewayah.hello_world.repository;

import com.hewayah.hello_world.entity.HobbyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface hobbyRepo extends JpaRepository<HobbyEntity, Integer> {
}
