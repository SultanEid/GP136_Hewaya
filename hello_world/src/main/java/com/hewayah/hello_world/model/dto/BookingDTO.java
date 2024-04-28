package com.hewayah.hello_world.model.dto;


import com.hewayah.hello_world.model.entity.Booking.BookingStatus;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class BookingDTO {

    private Integer bookId;

    @NotNull(message = "Booking date is required")
    private LocalDate bookingDate;

    @NotNull(message = "Booking status is required")
    private BookingStatus bookingStatus;

    private Integer hobbyistId;

    private Integer eventId;
}