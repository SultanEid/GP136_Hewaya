package com.hewayah.hello_world.model.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
public class EventDTO {
    private int eventId;
    private String eventName;
    private int hobbyId;
    private Date time;
    private int numberOfHobbyists;
    private int requirementAge;
    private String location;
    private double eventPrice;
    private LocalDateTime dateCreate;
    private LocalDateTime dateUpdate;
    private List<Integer> bookingIds;
    private List<Integer> eventHobbyIds;
}