package com.hewayah.hello_world.model.mapper;
import com.hewayah.hello_world.model.dto.ServiceProviderDTO;



import com.hewayah.hello_world.model.entity.ServiceProvider;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ServiceProviderMapper {
    ServiceProviderDTO toDTO(ServiceProvider serviceProvider);

    ServiceProvider toEntity(ServiceProviderDTO serviceProviderDTO);
}