package com.hewayah.hello_world.model.dto;

import lombok.Data;

@Data
public class HobbyDTO {
    private int hobbyId;
    private String hobbyName;
    private String hobbyCategory;
    private String hobbyDescription;
}