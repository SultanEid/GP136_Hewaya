package com.hewayah.hello_world.model.mapper;

import com.hewayah.hello_world.model.dto.ChatDTO;
import com.hewayah.hello_world.model.entity.Chat;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChatMapper {
    ChatMapper INSTANCE = Mappers.getMapper(ChatMapper.class);

    @Mapping(source = "serviceProvider.id", target = "serviceProviderId")
    @Mapping(source = "hobbyist.id", target = "hobbyistId")
    @Mapping(source = "message", target = "messageIds")
    ChatDTO toDTO(Chat chat);

    @Mapping(source = "serviceProviderId", target = "serviceProvider.id")
    @Mapping(source = "hobbyistId", target = "hobbyist.id")
    Chat toEntity(ChatDTO chatDTO);
}