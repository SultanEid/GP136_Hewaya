package com.hewayah.hello_world.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.validation.constraints.*;
//import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "hobbyist")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hobbyist extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hobbyis_id")
    private Long hobbyisId;

    @Column(name = "birth_date")
    @NotNull(message = "Birth date is required")
    @PastOrPresent(message = "Birth date must be in the past or present")
    private Date birthDate;
//
//    @Column(name = "hobbyist_username", unique = true)
//    @NotBlank(message = "Hobbyist username is required")
//    @Size(max = 255, message = "Hobbyist username must be less than or equal to 255 characters")
//    private String hobbyistUsername;
//
//    @Column(name = "password", length = 255)
//    @NotBlank(message = "Password is required")
//    @Size(min = 7, message = "Password must be at least 7 characters long")
//    private String password;
//
//    @Column(name = "email", length = 255, unique = true)
//    @NotBlank(message = "Email is required")
//    @Email(message = "Email should be valid")
//    private String email;
//
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @CreationTimestamp
//    @Column(name = "create_at")
//    private Date dateCreate;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @UpdateTimestamp
//    @Column(name = "update_at")
//    private Date dateUpdate;
////    @Temporal(TemporalType.TIMESTAMP)
////    @CreationTimestamp
////    @Column(name = "create_at")
////    private LocalDateTime dateCreate;
////
////
////    @Temporal(TemporalType.TIMESTAMP)
////    @UpdateTimestamp
////    @Column(name = "update_at")
////    private LocalDateTime dateUpdate;
//
//
//    @Column(name = "phone_number")
//    @NotNull(message = "Phone number is required")
//    @Positive(message = "Phone number must be positive")
//    private Integer phoneNumber;
//
//    @Column(name = "first_name", length = 255)
//    @Size(max = 255, message = "First name must be less than or equal to 255 characters")
//    private String firstName;
//
//    @Column(name = "last_name", length = 255)
//    @Size(max = 255, message = "Last name must be less than or equal to 255 characters")
//    private String lastName;
//

    //العلاقات في الاسفل

//    @OneToMany(mappedBy = "hobbyist")
//    private List<Chat> chats;
//
//    @OneToMany(mappedBy = "hobbyist1")
//        private List<Booking> booking;
//
    @OneToOne(mappedBy = "hobbyist")
    @JoinColumn(name ="user_id")
    private User user;
//
//    @OneToMany(mappedBy = "hobbyist")
//    private List<Bill> bill;


}