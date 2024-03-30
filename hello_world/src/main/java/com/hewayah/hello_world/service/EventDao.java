package com.hewayah.hello_world.service;
import com.hewayah.hello_world.repository.EventRepo;
import com.hewayah.hello_world.entity.EventEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventDao {
    @Autowired
    private EventRepo eventRepo ;

    public EventEntity saveEvent(EventEntity eventEntity) {
        return this.eventRepo.save(eventEntity);
    }

    public Optional<EventEntity> getEventById(int eventId) {
        return this.eventRepo.findById(eventId);
    }

    public List<EventEntity> getAllEvents() {
        return this.eventRepo.findAll();
    }

    public void deleteEvent(int eventId) {
        this.eventRepo.deleteById(eventId);
    }
}
