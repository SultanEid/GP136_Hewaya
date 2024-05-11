package com.hewayah.hello_world.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.validation.constraints.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_table")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @NotNull(message = "Username is required")
    @Size(max = 255, message = "Username must be at most 255 characters")
    @Column(name = "username", length = 255)
    private String username;

    @NotNull(message = "Password is required")
    @Size(min = 7, max = 255, message = "Password must be between 7 and 255 characters")
    @Column(name = "password", length = 255)
    private String password;

    @Email(message = "Invalid email address")
    @NotNull(message = "Email is required")
    @Size(max = 255, message = "Email must be at most 255 characters")
    @Column(name = "email", length = 255)
    private String email;

    @CreationTimestamp
    @Column(name = "create_at")
    private LocalDateTime createdAt;

    @CreationTimestamp
    @Column(name = "update_at")
    private LocalDateTime updatedAt;

    @NotNull(message = "Phone number is required")
    @Column(name = "phone_number")
    private Integer phoneNumber;

    @NotNull(message = "User type is required")
    @Enumerated(EnumType.STRING)
    @Column(name = "user_type")
    private UserType userType;

    @NotNull(message = "Name is required")
    @Size(max = 255, message = "Name must be at most 255 characters")
    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "bio")
    private String bio;

    @NotNull(message = "Gender is required")
    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;

    public enum Gender {
        MALE, FEMALE
    }

    public enum UserType {
        SERVICE_PROVIDER, HOBBYIST
    }


    /////////////////////////////////
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Hobbyist hobbyist;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private ServiceProvider serviceProvider ;


}