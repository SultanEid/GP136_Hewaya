package com.hewayah.hello_world.repository;
import com.hewayah.hello_world.entity.EventEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepo extends JpaRepository<EventEntity,Integer> {
}
