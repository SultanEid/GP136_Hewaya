package com.hewayah.hello_world.controller;
import com.hewayah.hello_world.entity.MessageEntity;
import com.hewayah.hello_world.service.MessageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MessageController {
    @Autowired
    private MessageDao messageDao;



    @GetMapping("/getAllMessages")
    public List<MessageEntity> getAllMessages() {
        return messageDao.getAllMessages();
    }

    @PostMapping("/createMessage")
    public void createMessage(@RequestBody MessageEntity message) {
        messageDao.saveMessage(message);
    }

    @DeleteMapping("deleteMessageById/{id}")
    public void deleteMessageById(@PathVariable int id) {
        messageDao.deleteMessageById(id);
    }

}