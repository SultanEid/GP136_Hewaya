package com.hewaya.hello_world.repository;

import com.hewaya.hello_world.entity.Hobbyist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbyistRepo extends JpaRepository<Hobbyist, Integer> {
    Hobbyist findByName(String name);
}
