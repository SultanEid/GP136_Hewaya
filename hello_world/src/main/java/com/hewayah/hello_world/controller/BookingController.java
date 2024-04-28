package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.model.dto.BookingDTO;
import com.hewayah.hello_world.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public ResponseEntity<BookingDTO> createBooking(@RequestBody @Validated BookingDTO bookingDTO) {
        BookingDTO createdBooking = bookingService.createBooking(bookingDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBooking);
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<BookingDTO> getBookingById(@PathVariable Integer bookId) {
        BookingDTO booking = bookingService.getBookingById(bookId);
        return ResponseEntity.ok(booking);
    }

    // Other endpoints...
}