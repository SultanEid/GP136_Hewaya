package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.entity.ChatEntity;
import com.hewayah.hello_world.service.ChatDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chats")
public class ChatController {
    @Autowired
    private ChatDao chatDao;



    @GetMapping("/getAllChats")
    public List<ChatEntity> getAllChats() {
        return chatDao.getAllChats();
    }

    @GetMapping("/getChatById/{id}")
    public ChatEntity getChatById(@PathVariable int id) {
        return chatDao.getChatById(id).orElse(null);
    }

    @PostMapping("/createChat")
    public void createChat(@RequestBody ChatEntity chat) {
        chatDao.saveChat(chat);
    }

    @DeleteMapping("/deleteChat/{id}")
    public void deleteChat(@PathVariable int id) {
        chatDao.deleteChatById(id);
    }
}
