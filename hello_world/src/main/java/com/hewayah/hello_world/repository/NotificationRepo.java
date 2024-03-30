package com.hewayah.hello_world.repository;

import com.hewayah.hello_world.entity.NotificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepo extends JpaRepository<NotificationEntity, Integer> {

}