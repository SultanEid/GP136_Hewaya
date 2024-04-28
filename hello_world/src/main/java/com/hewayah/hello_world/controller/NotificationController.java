package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.model.dto.NotificationDTO;
import com.hewayah.hello_world.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/notifications")
    public class NotificationController {
        private final NotificationService notificationService;

        @Autowired
        public NotificationController(NotificationService notificationService) {
            this.notificationService = notificationService;
        }

        @PostMapping
        public ResponseEntity<NotificationDTO> createNotification(@RequestBody NotificationDTO notificationDTO) {
            NotificationDTO createdNotification = notificationService.createNotification(notificationDTO);
            return new ResponseEntity<>(createdNotification, HttpStatus.CREATED);
        }

        @PutMapping("/{id}")
        public ResponseEntity<NotificationDTO> updateNotification(
                @PathVariable("id") int id,
                @RequestBody NotificationDTO notificationDTO
        ) {
            NotificationDTO updatedNotification = notificationService.updateNotification(id, notificationDTO);
            if (updatedNotification != null) {
                return new ResponseEntity<>(updatedNotification, HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteNotification(@PathVariable("id") int id) {
            notificationService.deleteNotification(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        @GetMapping("/{id}")
        public ResponseEntity<NotificationDTO> getNotificationById(@PathVariable("id") int id) {
            NotificationDTO notificationDTO = notificationService.getNotificationById(id);
            if (notificationDTO != null) {
                return new ResponseEntity<>(notificationDTO, HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        @GetMapping
        public ResponseEntity<List<NotificationDTO>> getAllNotifications() {
            List<NotificationDTO> notifications = notificationService.getAllNotifications();
            return new ResponseEntity<>(notifications, HttpStatus.OK);
        }
    }