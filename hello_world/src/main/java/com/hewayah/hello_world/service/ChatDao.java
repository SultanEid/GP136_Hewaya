package com.hewayah.hello_world.service;

import com.hewayah.hello_world.entity.ChatEntity;
import com.hewayah.hello_world.repository.ChatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ChatDao {
    @Autowired
    private ChatRepo chatRepo;


    public List<ChatEntity> getAllChats() {
        return chatRepo.findAll();
    }

    public Optional<ChatEntity> getChatById(int id) {
        return chatRepo.findById(id);
    }

    public void saveChat(ChatEntity chat) {
        chatRepo.save(chat);
    }

    public void deleteChat(ChatEntity chat) {
        chatRepo.delete(chat);
    }

    public void deleteChatById(int id) {
        chatRepo.deleteById(id);
    }
}
