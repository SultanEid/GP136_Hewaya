package com.hewayah.hello_world.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "administrator")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "adminstrator_id", nullable = false)
    private int adminstratorId;

    @NotBlank(message = "Administrator username is required")
    @Size(max = 255, message = "Administrator username must be less than or equal to 255 characters")
    @Column(name = "adminstrator_username", nullable = false, length = 255)
    private String adminstratorUsername;

    @NotBlank(message = "Password is required")
    @Size(min = 7, message = "Password must be at least 7 characters long")
    @Column(name = "password", length = 255)
    private String password;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    @Size(max = 255, message = "Email must be less than or equal to 255 characters")
    @Column(name = "email", length = 255, unique = true)
    private String email;

    @NotNull(message = "Creation date is required")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "date_create")
    private LocalDateTime dateCreate;

    @Positive(message = "Phone number must be positive")
    @Column(name = "phone_number")
    private Integer phoneNumber;

    @Size(max = 255, message = "First name must be less than or equal to 255 characters")
    @Column(name = "first_name", length = 255)
    private String firstName;

    @Size(max = 255, message = "Last name must be less than or equal to 255 characters")
    @Column(name = "last_name", length = 255)
    private String lastName;
}