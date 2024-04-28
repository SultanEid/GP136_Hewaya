package com.hewayah.hello_world.model.dto;

import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
public class HobbyistDTO {
    private Long hobbyistId;

    @NotNull(message = "Birth date is required")
    @PastOrPresent(message = "Birth date must be in the past or present")
    private Date birthDate;

    @NotBlank(message = "Hobbyist username is required")
    @Size(max = 255, message = "Hobbyist username must be less than or equal to 255 characters")
    private String hobbyistUsername;

    @NotBlank(message = "Password is required")
    @Size(min = 7, message = "Password must be at least 7 characters long")
    private String password;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @NotNull(message = "Phone number is required")
    @Positive(message = "Phone number must be positive")
    private Integer phoneNumber;

    @Size(max = 255, message = "First name must be less than or equal to 255 characters")
    private String firstName;

    @Size(max = 255, message = "Last name must be less than or equal to 255 characters")
    private String lastName;
}