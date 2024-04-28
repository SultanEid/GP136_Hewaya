package com.hewayah.hello_world.model.mapper;

import com.hewayah.hello_world.model.dto.HobbyDTO;
import com.hewayah.hello_world.model.entity.Hobby;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HobbyMapper {
    HobbyMapper INSTANCE = Mappers.getMapper(HobbyMapper.class);

    HobbyDTO toDTO(Hobby hobby);

    Hobby toEntity(HobbyDTO hobbyDTO);
}