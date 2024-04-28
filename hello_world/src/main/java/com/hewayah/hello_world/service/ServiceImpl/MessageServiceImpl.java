package com.hewayah.hello_world.service.ServiceImpl;

import com.hewayah.hello_world.model.dto.MessageDTO;
import com.hewayah.hello_world.model.entity.Chat;
import com.hewayah.hello_world.model.entity.Message;
import com.hewayah.hello_world.model.mapper.MessageMapper;
import com.hewayah.hello_world.repository.MessageRepository;
import com.hewayah.hello_world.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MessageServiceImpl implements MessageService {
    private final MessageRepository messageRepository;
    private final MessageMapper messageMapper;

    @Autowired
    public MessageServiceImpl(MessageRepository messageRepository, MessageMapper messageMapper) {
        this.messageRepository = messageRepository;
        this.messageMapper = messageMapper;
    }

    @Override
    public MessageDTO createMessage(MessageDTO messageDTO) {
        Message message = messageMapper.toEntity(messageDTO);
        Message savedMessage = messageRepository.save(message);
        return messageMapper.toDTO(savedMessage);
    }

    @Override
    public MessageDTO updateMessage(int id, MessageDTO messageDTO) {
        return null;
    }

    /*
        @Override
        public MessageDTO updateMessage(int id, MessageDTO messageDTO) {
            Optional<Message> optionalMessage = messageRepository.findById(id);
            if (optionalMessage.isPresent()) {
                Message message = optionalMessage.get();
                message.setSenderUsername(messageDTO.getSenderUsername());
                message.setContent(messageDTO.getContent());
                message.setSentDate(messageDTO.getSentDate());
                // Set the Chat entity based on the chatId in the DTO
                Chat chat = new Chat();
                chat.setId(messageDTO.getChatId());
                message.setChat(chat);

                Message updatedMessage = messageRepository.save(message);
                return messageMapper.toDTO(updatedMessage);
            }
            return null;
        }


     */
    @Override
    public void deleteMessage(int id) {
        messageRepository.deleteById(id);
    }

    @Override
    public MessageDTO getMessageById(int id) {
        Optional<Message> optionalMessage = messageRepository.findById(id);
        return optionalMessage.map(messageMapper::toDTO).orElse(null);
    }

    @Override
    public List<MessageDTO> getAllMessages() {
        List<Message> messages = messageRepository.findAll();
        return messages.stream()
                .map(messageMapper::toDTO)
                .collect(Collectors.toList());
    }
}