package com.hewayah.hello_world.service;

import com.hewayah.hello_world.model.dto.NotificationDTO;

import java.util.List;

public interface NotificationService {
    NotificationDTO createNotification(NotificationDTO notificationDTO);
    NotificationDTO updateNotification(int id, NotificationDTO notificationDTO);
    void deleteNotification(int id);
    NotificationDTO getNotificationById(int id);
    List<NotificationDTO> getAllNotifications();
}