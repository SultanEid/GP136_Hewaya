package com.hewayah.hello_world.service;
import com.hewayah.hello_world.entity.MessageEntity;
import com.hewayah.hello_world.repository.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageDao {
    @Autowired
    private MessageRepo messageRepo ;



    public List<MessageEntity> getAllMessages() {
        return messageRepo.findAll();
    }

    public void saveMessage(MessageEntity message) {
        messageRepo.save(message);
    }

    public void deleteMessageById(int id) {
        messageRepo.deleteById(id);
    }


}