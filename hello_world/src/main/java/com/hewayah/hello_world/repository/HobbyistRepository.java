package com.hewayah.hello_world.repository;

import com.hewayah.hello_world.entity.Hobbyist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbyistRepository extends JpaRepository<Hobbyist, Long> {

}
