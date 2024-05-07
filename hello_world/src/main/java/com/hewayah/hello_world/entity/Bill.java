package com.hewayah.hello_world.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.*;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

//import java.time.LocalDateTime;
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
    private Date time;

    @Column(name = "event_id")
    private Integer eventId;

    @Column(name = "is_pay")
    private boolean isPay;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "create_at")
    private Date dateCreate;


    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    @Column(name = "update_at")
    private Date dateUpdate;


    // العلاقات الأخرى...

    @ManyToOne
    @JoinColumn(name = "hobbyist_id")
    private Hobbyist hobbyist;

    @ManyToOne
    @JoinColumn(name = "service_provider_id")
    private ServiceProvider serviceProvider;

    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

}