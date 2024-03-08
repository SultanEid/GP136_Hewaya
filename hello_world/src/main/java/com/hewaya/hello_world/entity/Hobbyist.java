package com.hewaya.hello_world.entity;

import jakarta.persistence.*;
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
public class Hobbyist {

    @Id
    @GeneratedValue
    private int user_id;
    private String name;
    private String email;
    private String username;
    private String password;


}
