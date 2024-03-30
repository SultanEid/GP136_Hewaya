package com.hewayah.hello_world.repository;

import com.hewayah.hello_world.entity.ChatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepo extends JpaRepository<ChatEntity, Integer> {
}
