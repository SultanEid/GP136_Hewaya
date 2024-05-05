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
public class ServiceProvider {
    @Id
    @Column(name = "service_provider_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serviceProviderId;

    @NotNull
    @Size(max = 255)
    @Column(name = "service_provider_username", length = 255)
    private String serviceProviderUsername;

    @Column(name = "bio")
    private String bio;

    @NotNull
    @Size(max = 255)
    @Column(name = "password", length = 255)
    private String password;

    @Email
    @NotNull
    @Size(max = 255)
    @Column(name = "email", length = 255)
    private String email;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "create_at")
    private LocalDateTime dateCreate;

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    @Column(name = "update_at")
    private LocalDateTime dateUpdate;

    @Column(name = "phone_number")
    private Integer phoneNumber;

    @NotNull
    @Size(max = 255)
    @Column(name = "service_provider_name", length = 255)
    private String serviceProviderName;

    @OneToMany(mappedBy = "serviceProvider")
    private List<Chat> chats;

    @OneToMany(mappedBy = "serviceProvider")
    private List<Bill> billEntities;

    @OneToMany(mappedBy = "serviceProvider")
    private List<Notification> notificationEntities;
}