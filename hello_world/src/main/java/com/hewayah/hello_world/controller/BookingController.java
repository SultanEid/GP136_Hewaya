package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.entity.BookingEntity;
import com.hewayah.hello_world.service.BookingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class BookingController {

    @Autowired
    private BookingDao bookingDao;

    @PostMapping("/createBooking")
    public BookingEntity createBooking(@RequestBody BookingEntity booking) {
        return bookingDao.saveBooking(booking);
    }

    @GetMapping("/getBookingById/{bookId}")
    public Optional<BookingEntity> getBookingById(@PathVariable Integer bookId) {
        return bookingDao.getBookingById(bookId);
    }

    @DeleteMapping("/deleteBooking/{bookId}")
    public void deleteBooking(@PathVariable Integer bookId) {
        Optional<BookingEntity> booking = bookingDao.getBookingById(bookId);
        booking.ifPresent(bookingDao::deleteBooking);
    }

    @GetMapping("/getAllBookings")
    public List<BookingEntity> getAllBookings() {
        return bookingDao.getAllBookings();
    }

    @GetMapping("/getBookingsByServiceProvider/{username}")
    public List<BookingEntity> getBookingsByServiceProvider(@PathVariable String username) {
        return bookingDao.getBookingsByServiceProvider(username);
    }

    @GetMapping("/getBookingsByHobbyist/{username}")
    public List<BookingEntity> getBookingsByHobbyist(@PathVariable String username) {
        return bookingDao.getBookingsByHobbyist(username);
    }

    @GetMapping("/getBookingsByStatus/{bookingStatus}")
    public List<BookingEntity> getBookingsByStatus(@PathVariable BookingEntity.BookingStatus bookingStatus) {
        return bookingDao.getBookingsByStatus(bookingStatus);
    }

    @GetMapping("/getBookingByEventId/{eventId}")
    public Optional<BookingEntity> getBookingByEventId(@PathVariable Integer eventId) {
        return bookingDao.getBookingByEventId(eventId);
    }

    @GetMapping("/getBookingsByDate/{bookingDate}")
    public List<BookingEntity> getBookingsByDate(@PathVariable LocalDate bookingDate) {
        return bookingDao.getBookingsByDate(bookingDate);
    }

    @GetMapping("/getBookingsByServiceProviderAndStatus/{username}/status/{bookingStatus}")
    public List<BookingEntity> getBookingsByServiceProviderAndStatus(@PathVariable String username, @PathVariable BookingEntity.BookingStatus bookingStatus) {
        return bookingDao.getBookingsByServiceProviderAndStatus(username, bookingStatus);
    }

    @GetMapping("/getBookingsByHobbyistAndStatus/{username}/status/{bookingStatus}")
    public List<BookingEntity> getBookingsByHobbyistAndStatus(@PathVariable String username, @PathVariable BookingEntity.BookingStatus bookingStatus) {
        return bookingDao.getBookingsByHobbyistAndStatus(username, bookingStatus);
    }

}