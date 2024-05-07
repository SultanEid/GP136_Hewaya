package com.hewayah.hello_world.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="profile_id")
    private Long profileId;

    // Other attributes

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Getters and setters
}