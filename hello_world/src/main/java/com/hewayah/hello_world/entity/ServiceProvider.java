package com.hewayah.hello_world.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "service_provider")
public class ServiceProvider extends User {

    // Getters and Setters for additional fields and relationships

    @OneToMany(mappedBy = "serviceProvider" ,cascade = CascadeType.ALL)
    private List<Chat> chats;

    @OneToMany(mappedBy = "serviceProvider",cascade = CascadeType.ALL)
    private List<Bill> billEntities;

    @OneToMany(mappedBy = "serviceProvider", cascade = CascadeType.ALL)
    private List<Notification> notificationEntities;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

}