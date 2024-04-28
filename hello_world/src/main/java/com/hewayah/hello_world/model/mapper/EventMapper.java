package com.hewayah.hello_world.model.mapper;

import com.hewayah.hello_world.model.dto.EventDTO;
import com.hewayah.hello_world.model.entity.Event;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EventMapper {
    EventMapper INSTANCE = Mappers.getMapper(EventMapper.class);

    @Mapping(source = "bookingEntities", target = "bookingIds")
    @Mapping(source = "eventHobbies", target = "eventHobbyIds")
    EventDTO toDTO(Event event);

    @Mapping(source = "bookingIds", target = "bookingEntities")
    @Mapping(source = "eventHobbyIds", target = "eventHobbies")
    Event toEntity(EventDTO eventDTO);
}