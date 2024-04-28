package com.hewayah.hello_world.service;

import com.hewayah.hello_world.model.dto.MessageDTO;

import java.util.List;

public interface MessageService {
    MessageDTO createMessage(MessageDTO messageDTO);
    MessageDTO updateMessage(int id, MessageDTO messageDTO);
    void deleteMessage(int id);
    MessageDTO getMessageById(int id);
    List<MessageDTO> getAllMessages();
}