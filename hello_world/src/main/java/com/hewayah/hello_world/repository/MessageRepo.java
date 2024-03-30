package com.hewayah.hello_world.repository;
import com.hewayah.hello_world.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<MessageEntity,Integer> {
}
