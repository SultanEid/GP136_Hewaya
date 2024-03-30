package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.entity.EventEntity;
import com.hewayah.hello_world.service.EventDao;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EventController {
    @Autowired
    private EventDao eventDao;

    @PostMapping
    public EventEntity createEvent(@RequestBody EventEntity eventEntity) {
        return eventDao.saveEvent(eventEntity);
    }

    @GetMapping("getEventById/{eventId}")
    public EventEntity getEventById(@PathVariable int eventId) {
        Optional<EventEntity> event = eventDao.getEventById(eventId);
        return event.orElse(null);
    }


    @GetMapping("getAllEvents")
    public List<EventEntity> getAllEvents() {
        return this.eventDao.getAllEvents();

    }

    @DeleteMapping("deleteEvent/{eventId}")
    public void deleteEvent(@PathVariable int eventId) {
        this.eventDao.deleteEvent(eventId);

    }
}

