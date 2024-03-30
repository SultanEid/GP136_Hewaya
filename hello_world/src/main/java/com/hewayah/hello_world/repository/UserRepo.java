package com.hewayah.hello_world.repository;

import com.hewayah.hello_world.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepo extends JpaRepository<UserEntity,String> {

}
