package com.hewayah.hello_world.model.mapper;

import com.hewayah.hello_world.model.dto.BookingDTO;
import com.hewayah.hello_world.model.entity.Booking;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookingMapper {

    BookingMapper INSTANCE = Mappers.getMapper(BookingMapper.class);

    @Mapping(target = "hobbyist1.id", source = "hobbyistId")
    @Mapping(target = "eventEntity.id", source = "eventId")
    Booking toBooking(BookingDTO bookingDTO);

    @Mapping(target = "hobbyistId", source = "hobbyist1.id")
    @Mapping(target = "eventId", source = "eventEntity.id")
    BookingDTO toBookingDTO(Booking booking);
}