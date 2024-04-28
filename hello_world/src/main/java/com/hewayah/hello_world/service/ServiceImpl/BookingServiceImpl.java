package com.hewayah.hello_world.service.ServiceImpl;

import com.hewayah.hello_world.model.dto.BookingDTO;
import com.hewayah.hello_world.model.mapper.BookingMapper;
import com.hewayah.hello_world.model.entity.Booking;
import com.hewayah.hello_world.repository.BookingRepository;
import com.hewayah.hello_world.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;

    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository, BookingMapper bookingMapper) {
        this.bookingRepository = bookingRepository;
        this.bookingMapper = bookingMapper;
    }

    @Override
    public BookingDTO createBooking(BookingDTO bookingDTO) {
        Booking booking = bookingMapper.toBooking(bookingDTO);
        Booking savedBooking = bookingRepository.save(booking);
        return bookingMapper.toBookingDTO(savedBooking);
    }

    @Override
    public BookingDTO getBookingById(Integer bookId) {
        Booking booking = bookingRepository.findById(bookId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid bookId"));
        return bookingMapper.toBookingDTO(booking);
    }

}