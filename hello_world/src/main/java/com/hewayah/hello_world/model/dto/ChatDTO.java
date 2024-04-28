package com.hewayah.hello_world.model.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ChatDTO {
    private Long chatId;
    private LocalDateTime dateCreate;
    private Long serviceProviderId;
    private Long hobbyistId;
    private List<Long> messageIds;
}