package com.hewayah.hello_world.model.mapper;

import com.hewayah.hello_world.model.dto.BillDTO;
import com.hewayah.hello_world.model.entity.Bill;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BillMapper {

    BillMapper INSTANCE = Mappers.getMapper(BillMapper.class);

    @Mapping(target = "hobbyistId", source = "hobbyist.id")
    @Mapping(target = "serviceProviderId", source = "serviceProvider.id")
    @Mapping(target = "bookingId", source = "booking.bookId")
    BillDTO toBillDTO(Bill bill);

    @Mapping(target = "hobbyist.id", source = "hobbyistId")
    @Mapping(target = "serviceProvider.id", source = "serviceProviderId")
    @Mapping(target = "booking.bookId", source = "bookingId")
    Bill toBill(BillDTO billDTO);
}