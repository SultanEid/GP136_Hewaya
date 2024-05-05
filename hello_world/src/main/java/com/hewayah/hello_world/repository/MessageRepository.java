package com.hewayah.hello_world.repository;
import com.hewayah.hello_world.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Integer> {
}
