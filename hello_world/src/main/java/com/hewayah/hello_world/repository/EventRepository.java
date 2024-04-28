package com.hewayah.hello_world.repository;
import com.hewayah.hello_world.model.entity.Event;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Integer> {
}
