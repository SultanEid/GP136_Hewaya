package com.hewayah.hello_world.entity;

import jakarta.persistence.*;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notification_id")
    private int notificationId;


    @NotBlank
    @Size(max = 255)
    @Column(name = "notification_type")
    private String notificationType;

    @NotBlank
    @Column(name = "notification_message", columnDefinition = "TEXT")
    private String notificationMessage;

    @ManyToOne
    @JoinColumn(name = "service_provider_id")
    @NotNull
    private ServiceProvider serviceProvider;
}