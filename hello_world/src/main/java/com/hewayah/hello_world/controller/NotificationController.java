package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.entity.NotificationEntity;
import com.hewayah.hello_world.service.NotificationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NotificationController {

    @Autowired
    private NotificationDao notificationDao;



    @GetMapping("/getAllNotifications")
    public List<NotificationEntity> getAllNotifications() {
        return notificationDao.getAllNotifications();
    }

    @GetMapping("/getNotificationById/{id}")
    public NotificationEntity getNotificationById(@PathVariable int id) {
        return notificationDao.getNotificationById(id).orElse(null);
    }

    @PostMapping("/createNotification")
    public void createNotification(@RequestBody NotificationEntity notification) {
        notificationDao.saveNotification(notification);
    }

    @DeleteMapping("/deleteNotification{id}")
    public void deleteNotification(@PathVariable int id) {
        notificationDao.deleteNotificationById(id);
    }
}