package com.hewayah.hello_world.model.entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer bookId;

    @NotNull(message = "Booking date is required")
    @Column(name = "booking_date")
    private LocalDate bookingDate;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Booking status is required")
    @Column(name = "booking_status")
    private BookingStatus bookingStatus;

    public enum BookingStatus {
        Confirmed,
        Cancelled,
        NoShow,
        CheckedIn,
        CheckedOut
    }

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "create_at")
    private LocalDateTime dateCreate;

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    @Column(name = "update_at")
    private LocalDateTime dateUpdate;

    // Relationships below
    @ManyToOne
    @JoinColumn(name = "hobbyist_id")
    private Hobbyist hobbyist1 ;

    @OneToOne(mappedBy = "booking")
    private Bill bill;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event eventEntity;
}