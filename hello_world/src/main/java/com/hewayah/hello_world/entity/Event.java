package com.hewayah.hello_world.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

//import javax.persistence.*;
//import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "event")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private int eventId;
    @Column(name = "event_name")
    private String eventName;
    @Column(name = "hoppy_id")
    private int hobbyId;
    @Column(name = "time")
    private Date time;
    @Column(name = "number_of_hobbist")
    private int numberOfHobbyists;
    @Column(name = "requirement_age")
    private int requirementAge;
    @Column(name = "location")
    private String location;
    @Column(name = "event_price")
    private double eventPrice;


    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "create_at")
    private Date dateCreate;

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    @Column(name = "update_at")
    private Date dateUpdate;
//    @Temporal(TemporalType.TIMESTAMP)
//    @CreationTimestamp
//    @Column(name = "create_at")
//    private LocalDateTime dateCreate;
//
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @UpdateTimestamp
//    @Column(name = "update_at")
//    private LocalDateTime dateUpdate;


    @OneToMany(mappedBy = "eventEntity")
    private List<Booking> bookingEntities;

    @OneToMany(mappedBy = "event")
    private List<EventHobby> eventHobbies;
}
