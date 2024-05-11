package com.hewayah.hello_world.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "event_hobby")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventHobby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_hobby_id")
    private int eventHobbyId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "event_id")
    private Event event;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hobby_id")
    private Hobby hobby;

}