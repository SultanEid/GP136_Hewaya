package com.hewayah.hello_world.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
//import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hobby")
public class HobbyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hobby_id")
    private int hobbyId;

    @Column(name = "hobby_name")
    private String hobbyName;

    @Column(name = "hobby_category")
    private String hobbyCategory;

    @Column(name = "hobby_description", columnDefinition = "TEXT")
    private String hobbyDescription;


}