package com.hewayah.hello_world.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceProviderDTO {
    private Long serviceProviderId;
    private String serviceProviderUsername;
    private String bio;
    private String password;
    private String email;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private Integer phoneNumber;
    private String serviceProviderName;
}