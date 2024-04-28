package com.hewayah.hello_world.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageDTO {
    private int messageId;
    private String senderUsername;
    private String content;
    private LocalDateTime sentDate;
    private int chatId;
}