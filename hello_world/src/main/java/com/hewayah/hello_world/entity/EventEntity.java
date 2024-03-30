package com.hewayah.hello_world.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

//import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "event")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventEntity {
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
}
