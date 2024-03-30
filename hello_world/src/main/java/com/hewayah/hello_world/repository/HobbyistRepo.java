package com.hewayah.hello_world.repository;

import com.hewayah.hello_world.entity.HobbyistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbyistRepo extends JpaRepository<HobbyistEntity, Integer> {
    HobbyistEntity findByName(String name);
    HobbyistEntity findByUsername(String username);
//  List<HobbyistEntity> findByUsernames(String username);

    HobbyistEntity findByEmail(String email);
//    HobbyistEntity findByPassword(String password);
}
