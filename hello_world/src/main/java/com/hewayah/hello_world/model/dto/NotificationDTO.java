package com.hewayah.hello_world.model.dto;

import lombok.Data;

@Data
public class NotificationDTO {
    private int notificationId;
    private String senderUsername;
    private String receiverUsername;
    private String notificationType;
    private String notificationMessage;
    private int serviceProviderId;
}