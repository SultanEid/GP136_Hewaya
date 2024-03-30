package com.hewayah.hello_world.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
//import javax.persistence.*;
import jakarta.persistence.*;
import java.util.Date;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user1") // Assuming the table name is "user1"
public class UserEntity {

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "username", nullable = false, length = 255)
    private String username;

    @Column(name = "password", length = 255)
    private String password;

    @Column(name = "email", length = 255)
    private String email;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "date_create")
    private Date dateCreate;

    @Column(name = "phone_number")
    private Integer phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_type")
    private UserType userType;

    @Column(name = "first_name", length = 255)
    private String firstName;

    @Column(name = "last_name", length = 255)
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private gender gender;
    public enum gender {
        male, female, other
    }
    public enum UserType {
        service_provider, hobbyist, administrator
    }
}