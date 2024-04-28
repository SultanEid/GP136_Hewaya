package com.hewayah.hello_world.repository;

import com.hewayah.hello_world.model.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Long> {
}
