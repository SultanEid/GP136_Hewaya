package com.hewayah.hello_world.model.mapper;

import com.hewayah.hello_world.model.dto.MessageDTO;
import com.hewayah.hello_world.model.entity.Message;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MessageMapper {
    MessageMapper INSTANCE = Mappers.getMapper(MessageMapper.class);

    @Mapping(source = "chat.id", target = "chatId")
    MessageDTO toDTO(Message message);

    @Mapping(source = "chatId", target = "chat.id")
    Message toEntity(MessageDTO messageDTO);
}