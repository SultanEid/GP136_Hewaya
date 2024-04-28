package com.hewayah.hello_world.service;

import com.hewayah.hello_world.model.dto.EventDTO;

public interface EventService {
    EventDTO createEvent(EventDTO eventDTO);
    void deleteEvent(int id);
    EventDTO getEventById(int id);
}