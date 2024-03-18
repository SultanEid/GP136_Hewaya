package com.hewaya.hello_world.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Table(name ="hobbyist")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HobbyistEntity {
    //for Springboot
    //firstName

    //for Database
    //first_name
    @Id
    @GeneratedValue
    private int user_id;
    private String name;
    private String email;
    private String username;
    private String password;


}
