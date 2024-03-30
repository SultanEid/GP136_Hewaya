package com.hewayah.hello_world.service;
import com.hewayah.hello_world.repository.BookingRepo;

import com.hewayah.hello_world.entity.BookingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class BookingDao {
    @Autowired
    private BookingRepo bookingRepo;

    public BookingEntity saveBooking(BookingEntity bookingEntity) {
        return bookingRepo.save(bookingEntity);
    }

    public Optional<BookingEntity> getBookingById(Integer bookId) {
        return bookingRepo.findById(bookId);
    }

    public void deleteBooking(BookingEntity bookingEntity) {
        bookingRepo.delete(bookingEntity);
    }

    public List<BookingEntity> getAllBookings() {
        return bookingRepo.findAll();
    }

    public List<BookingEntity> getBookingsByServiceProvider(String serviceProviderUsername) {
        return bookingRepo.findByServiceProviderUsername(serviceProviderUsername);
    }

    public List<BookingEntity> getBookingsByHobbyist(String hobbyistUsername) {
        return bookingRepo.findByHobbyistUsername(hobbyistUsername);
    }

    public List<BookingEntity> getBookingsByStatus(BookingEntity.BookingStatus bookingStatus) {
        return bookingRepo.findByBookingStatus(bookingStatus);
    }

    public Optional<BookingEntity> getBookingByEventId(Integer eventId) {
        return bookingRepo.findByEventId(eventId);
    }

    public List<BookingEntity> getBookingsByDate(LocalDate bookingDate) {
        return bookingRepo.findByBookingDate(bookingDate);
    }

    public List<BookingEntity> getBookingsByServiceProviderAndStatus(String serviceProviderUsername, BookingEntity.BookingStatus bookingStatus) {
        return bookingRepo.findByServiceProviderUsernameAndBookingStatus(serviceProviderUsername, bookingStatus);
    }

    public List<BookingEntity> getBookingsByHobbyistAndStatus(String hobbyistUsername, BookingEntity.BookingStatus bookingStatus) {
        return bookingRepo.findByHobbyistUsernameAndBookingStatus(hobbyistUsername, bookingStatus);
    }



}