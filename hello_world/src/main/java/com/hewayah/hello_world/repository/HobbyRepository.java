package com.hewayah.hello_world.repository;

import com.hewayah.hello_world.model.entity.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbyRepository extends JpaRepository<Hobby, Integer> {
}
