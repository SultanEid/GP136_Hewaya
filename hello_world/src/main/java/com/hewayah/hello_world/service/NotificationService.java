package com.hewayah.hello_world.service;

import com.hewayah.hello_world.entity.Notification;
import com.hewayah.hello_world.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
//@Transactional
public class NotificationService {
    private final NotificationRepository notificationRepository;

    @Autowired
    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    public Optional<Notification> getNotificationById(int id) {
        return notificationRepository.findById(id);
    }

    public Notification createNotification(@Valid Notification notification) {
        return notificationRepository.save(notification);
    }

    public void updateNotification(int id, @Valid Notification updatedNotification) {
        Optional<Notification> existingNotification = notificationRepository.findById(id);
        existingNotification.ifPresent(notification -> {
            notification.setNotificationType(updatedNotification.getNotificationType());
            notification.setNotificationMessage(updatedNotification.getNotificationMessage());
            notification.setServiceProvider(updatedNotification.getServiceProvider());
        });
    }

    public void deleteNotification(int id) {
        notificationRepository.deleteById(id);
    }
}