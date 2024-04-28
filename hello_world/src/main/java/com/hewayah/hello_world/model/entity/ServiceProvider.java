package com.hewayah.hello_world.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Data@NoArgsConstructor@AllArgsConstructor
@Entity
@Table(name = "service_provider")
public class ServiceProvider {
    @Id
    @Column(name = "service_provider_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serviceProviderId;

    @Column(name = "service_provider_username", length = 255)
    private String serviceProviderUsername;

    //name the colums in table
    @Column(name = "bio")
    private String bio;

    @Column(name = "password", length = 255)
    private String password;

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

    @Column(name = "service_provider_name", length = 255)
    private String serviceProviderName;


    @OneToMany(mappedBy = "serviceProvider")
    private List<Chat> chats;

    @OneToMany(mappedBy = "serviceProvider")
    private List<Bill> billEntities;

    @OneToMany(mappedBy = "serviceProvider")
    private List<Notification> notificationEntities;

}
