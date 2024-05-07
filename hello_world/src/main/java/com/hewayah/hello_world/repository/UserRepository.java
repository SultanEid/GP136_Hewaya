package com.hewayah.hello_world.repository;


import com.hewayah.hello_world.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {
}
