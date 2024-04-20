package com.hewayah.hello_world.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
import jakarta.persistence.*;
@Data@NoArgsConstructor@AllArgsConstructor
@Entity
@Table(name = "service_provider")
public class ServiceProviderEntity {
    @Id
    @Column(name = "service_provider_username", length = 255)
    private String serviceProviderUsername;

    //name the colums in table
    @Column(name = "bio")
    private String bio;
}
