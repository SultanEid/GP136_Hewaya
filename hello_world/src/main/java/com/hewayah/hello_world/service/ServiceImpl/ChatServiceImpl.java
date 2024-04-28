package com.hewayah.hello_world.service.ServiceImpl;

import com.hewayah.hello_world.model.dto.ChatDTO;
import com.hewayah.hello_world.model.entity.Chat;
import com.hewayah.hello_world.model.mapper.ChatMapper;
import com.hewayah.hello_world.repository.ChatRepository;
import com.hewayah.hello_world.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChatServiceImpl implements ChatService {
    private final ChatRepository chatRepository;
    private final ChatMapper chatMapper;

    @Autowired
    public ChatServiceImpl(ChatRepository chatRepository, ChatMapper chatMapper) {
        this.chatRepository = chatRepository;
        this.chatMapper = chatMapper;
    }

    @Override
    public ChatDTO createChat(ChatDTO chatDTO) {
        Chat chat = chatMapper.toEntity(chatDTO);
        Chat savedChat = chatRepository.save(chat);
        return chatMapper.toDTO(savedChat);
    }

    @Override
    public void deleteChat(Long id) {
        Optional<Chat> optionalChat = chatRepository.findById(id);
        if (optionalChat.isPresent()) {
            chatRepository.delete(optionalChat.get());
        } else {
            throw new IllegalArgumentException("Chat not found with id: " + id);
        }
    }

    @Override
    public ChatDTO getChatById(Long id) {
        Optional<Chat> optionalChat = chatRepository.findById(id);
        if (optionalChat.isPresent()) {
            Chat chat = optionalChat.get();
            return chatMapper.toDTO(chat);
        } else {
            throw new IllegalArgumentException("Chat not found with id: " + id);
        }
    }
}