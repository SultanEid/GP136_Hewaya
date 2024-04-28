package com.hewayah.hello_world.model.entity;

import lombok.Data;

//import javax.persistence.*;
import jakarta.persistence.*;
@Data
@Entity
@Table(name = "notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notification_id")
    private int notificationId;

    @Column(name = "sender_username")
    private String senderUsername;

    @Column(name = "receiver_username")
    private String receiverUsername;

    @Column(name = "notification_type")
    private String notificationType;

    @Column(name = "notification_message", columnDefinition = "TEXT")
    private String notificationMessage;

    @ManyToOne
    @JoinColumn(name = "service_provider_id")
    private ServiceProvider serviceProvider;
}