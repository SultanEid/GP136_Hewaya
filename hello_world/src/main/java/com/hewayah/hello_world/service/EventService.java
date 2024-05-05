package com.hewayah.hello_world.service;

import com.hewayah.hello_world.entity.Event;
import com.hewayah.hello_world.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Optional<Event> getEventById(int eventId) {
        return eventRepository.findById(eventId);
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public void updateEvent(int eventId, Event updatedEvent) {
        Optional<Event> existingEvent = eventRepository.findById(eventId);
        existingEvent.ifPresent(event -> {
            event.setEventName(updatedEvent.getEventName());
            event.setHobbyId(updatedEvent.getHobbyId());
            event.setTime(updatedEvent.getTime());
            event.setNumberOfHobbyists(updatedEvent.getNumberOfHobbyists());
            event.setRequirementAge(updatedEvent.getRequirementAge());
            event.setLocation(updatedEvent.getLocation());
            event.setEventPrice(updatedEvent.getEventPrice());
            eventRepository.save(event);
        });
    }

    public void deleteEvent(int eventId) {
        eventRepository.deleteById(eventId);
    }
}