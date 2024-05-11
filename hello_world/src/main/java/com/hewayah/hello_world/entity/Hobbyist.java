package com.hewayah.hello_world.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "hobbyist")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hobbyist extends User {
    // Add additional fields and relationships specific to the Hobbyist class
    @Column(name = "birth_date")
    @NotNull(message = "Birth date is required")
    @PastOrPresent(message = "Birth date must be in the past or present")
    private Date birthDate;

    // Relationships specific to Hobbyist class
    @OneToMany(mappedBy = "hobbyist" ,cascade = CascadeType.ALL)
    private List<Chat> chats;

    @OneToMany(mappedBy = "hobbyist1", cascade = CascadeType.ALL)
    private List<Booking> booking;

    @OneToMany(mappedBy = "hobbyist",cascade = CascadeType.ALL)
    private List<Bill> bill;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;



}