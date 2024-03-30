package com.hewayah.hello_world.service;

import com.hewayah.hello_world.entity.NotificationEntity;
import com.hewayah.hello_world.repository.NotificationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class NotificationDao {
    @Autowired
    private NotificationRepo notificationRepo;



    public List<NotificationEntity> getAllNotifications() {
        return notificationRepo.findAll();
    }

    public Optional<NotificationEntity> getNotificationById(int id) {
        return notificationRepo.findById(id);
    }

    public void saveNotification(NotificationEntity notification) {
        notificationRepo.save(notification);
    }


    public void deleteNotificationById(int id) {
        notificationRepo.deleteById(id);
    }
}