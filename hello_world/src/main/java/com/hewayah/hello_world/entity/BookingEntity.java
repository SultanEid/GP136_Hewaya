package com.hewayah.hello_world.entity;

import lombok.Data;

//import javax.persistence.*;
import java.time.LocalDate;
import jakarta.persistence.*;
@Data
@Entity
@Table(name = "booking")
public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer bookId;

    @Column(name = "event_id")
    private Integer eventId;

    @Column(name = "hobbyist_username_bk")
    private String hobbyistUsername;

    @Column(name = "service_provider_username_bk")
    private String serviceProviderUsername;

    @Column(name = "booking_date")
    private LocalDate bookingDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "booking_status")
    private BookingStatus bookingStatus;


    public enum BookingStatus {
        Confirmed,
        Cancelled,
        NoShow ,
        CheckedIn ,
        CheckedOut
    }


}
