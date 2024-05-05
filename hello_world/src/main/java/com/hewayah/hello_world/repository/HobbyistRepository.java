package com.hewayah.hello_world.repository;

import com.hewayah.hello_world.entity.Hobbyist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbyistRepository extends JpaRepository<Hobbyist, Long> {
    //HobbyistEntity findByName(String name);
  //  HobbyistEntity findByUsername(String username);
//  List<HobbyistEntity> findByUsernames(String username);

    Hobbyist findByEmail(String email);
//    HobbyistEntity findByPassword(String password);
}
