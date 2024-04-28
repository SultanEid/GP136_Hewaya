package com.hewayah.hello_world.service;

import com.hewayah.hello_world.model.dto.ChatDTO;

public interface ChatService {
    ChatDTO createChat(ChatDTO chatDTO);
    void deleteChat(Long id);
    ChatDTO getChatById(Long id);
}