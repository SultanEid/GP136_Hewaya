package com.hewayah.hello_world.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.*;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "bill")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bill_id")
    private Integer billId;


    @Column(name = "time")
    @CreationTimestamp
    private LocalDateTime time;

    @Column(name = "event_id")
    private Integer eventId;

    @Column(name = "is_pay")
    private boolean isPay;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "create_at")
    private LocalDateTime dateCreate;


    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    @Column(name = "update_at")
    private LocalDateTime dateUpdate;


    // العلاقات الأخرى...

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hobbyist_id")
    private Hobbyist hobbyist;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "service_provider_id")
    private ServiceProvider serviceProvider;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "booking_id")
    private Booking booking;


}