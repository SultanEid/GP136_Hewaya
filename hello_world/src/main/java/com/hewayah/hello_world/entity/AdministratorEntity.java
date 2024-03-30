package com.hewayah.hello_world.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.*;
import jakarta.persistence.*;
@Entity
@Table(name = "administrator")//administrator
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdministratorEntity {
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "adminstrator_username", nullable = false, length = 255)
    private String adminstratorUsername;
}
