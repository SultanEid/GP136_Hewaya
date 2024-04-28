package com.hewayah.hello_world.service.ServiceImpl;

import com.hewayah.hello_world.model.dto.EventDTO;
import com.hewayah.hello_world.model.entity.Event;
import com.hewayah.hello_world.model.mapper.EventMapper;
import com.hewayah.hello_world.repository.EventRepository;
import com.hewayah.hello_world.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;
    private final EventMapper eventMapper;

    @Autowired
    public EventServiceImpl(EventRepository eventRepository, EventMapper eventMapper) {
        this.eventRepository = eventRepository;
        this.eventMapper = eventMapper;
    }

    @Override
    public EventDTO createEvent(EventDTO eventDTO) {
        Event event = eventMapper.toEntity(eventDTO);
        Event savedEvent = eventRepository.save(event);
        return eventMapper.toDTO(savedEvent);
    }

    @Override
    public void deleteEvent(int id) {
        Optional<Event> optionalEvent = eventRepository.findById(id);
        if (optionalEvent.isPresent()) {
            eventRepository.delete(optionalEvent.get());
        } else {
            throw new IllegalArgumentException("Event not found with id: " + id);
        }
    }

    @Override
    public EventDTO getEventById(int id) {
        Optional<Event> optionalEvent = eventRepository.findById(id);
        if (optionalEvent.isPresent()) {
            Event event = optionalEvent.get();
            return eventMapper.toDTO(event);
        } else {
            throw new IllegalArgumentException("Event not found with id: " + id);
        }
    }
}