package com.hewayah.hello_world.service;

import com.hewayah.hello_world.entity.Chat;
import com.hewayah.hello_world.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChatService {
    private final ChatRepository chatRepository;

    @Autowired
    public ChatService(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    public List<Chat> getAllChats() {
        return chatRepository.findAll();
    }

    public Optional<Chat> getChatById(Long chatId) {
        return chatRepository.findById(chatId);
    }

    public Chat createChat(Chat chat) {
        return chatRepository.save(chat);
    }

    public void updateChat(Long chatId, Chat updatedChat) {
        Optional<Chat> existingChat = chatRepository.findById(chatId);
        existingChat.ifPresent(chat -> {
            chat.setServiceProvider(updatedChat.getServiceProvider());
            chat.setHobbyist(updatedChat.getHobbyist());
            chatRepository.save(chat);
        });
    }

    public void deleteChat(Long chatId) {
        chatRepository.deleteById(chatId);
    }
}