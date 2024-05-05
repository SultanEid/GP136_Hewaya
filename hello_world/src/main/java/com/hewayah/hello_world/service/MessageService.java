package com.hewayah.hello_world.service;

import com.hewayah.hello_world.entity.Message;
import com.hewayah.hello_world.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    public Optional<Message> getMessageById(int messageId) {
        return messageRepository.findById(messageId);
    }

    public Message createMessage(Message message) {
        return messageRepository.save(message);
    }

    public void updateMessage(int messageId, Message updatedMessage) {
        Optional<Message> existingMessage = messageRepository.findById(messageId);
        existingMessage.ifPresent(message -> {
            message.setContent(updatedMessage.getContent());
            message.setSentDate(updatedMessage.getSentDate());
            message.setChat(updatedMessage.getChat());
            messageRepository.save(message);
        });
    }

    public void deleteMessage(int messageId) {
        messageRepository.deleteById(messageId);
    }
}