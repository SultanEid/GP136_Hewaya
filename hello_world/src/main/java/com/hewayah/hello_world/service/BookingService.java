package com.hewayah.hello_world.service;

import com.hewayah.hello_world.model.dto.BookingDTO;

public interface BookingService {

    BookingDTO createBooking(BookingDTO bookingDTO);

    BookingDTO getBookingById(Integer bookId);

    // Other methods...
}