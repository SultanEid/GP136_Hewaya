package com.hewayah.hello_world.service;

import com.hewayah.hello_world.entity.Booking;
import com.hewayah.hello_world.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Optional<Booking> getBookingById(Integer bookingId) {
        return bookingRepository.findById(bookingId);
    }

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public void updateBooking(Integer bookingId, Booking updatedBooking) {
        Optional<Booking> existingBooking = bookingRepository.findById(bookingId);
        existingBooking.ifPresent(booking -> {
            booking.setBookingDate(updatedBooking.getBookingDate());
            booking.setBookingStatus(updatedBooking.getBookingStatus());
            bookingRepository.save(booking);
        });
    }

    public void deleteBooking(Integer bookingId) {
        bookingRepository.deleteById(bookingId);
    }
}