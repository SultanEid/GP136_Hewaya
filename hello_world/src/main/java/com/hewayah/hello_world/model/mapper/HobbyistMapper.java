package com.hewayah.hello_world.model.mapper;

import com.hewayah.hello_world.model.dto.HobbyistDTO;
import com.hewayah.hello_world.model.entity.Hobbyist;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HobbyistMapper {
    HobbyistMapper INSTANCE = Mappers.getMapper(HobbyistMapper.class);

    HobbyistDTO toDTO(Hobbyist hobbyist);

    Hobbyist toEntity(HobbyistDTO hobbyistDTO);
}