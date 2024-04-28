package com.hewayah.hello_world.model.mapper;

import com.hewayah.hello_world.model.dto.NotificationDTO;
import com.hewayah.hello_world.model.entity.Notification;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NotificationMapper {
    NotificationMapper INSTANCE = Mappers.getMapper(NotificationMapper.class);

    @Mapping(source = "serviceProvider.id", target = "serviceProviderId")
    NotificationDTO toDTO(Notification notification);

    @Mapping(source = "serviceProviderId", target = "serviceProvider.id")
    Notification toEntity(NotificationDTO notificationDTO);
}