package com.eventhub.events.service;

import java.util.List;

import com.eventhub.events.model.Event;
import com.eventhub.events.repository.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    private final EventsRepository eventsRepository;

    @Autowired
    public EventService(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    public Event getEventById(String eventId) {
        return eventsRepository.findById(eventId);
    }

    public List<Event> getAllEvents() {
        return eventsRepository.findAll();
    }

    public Event createEvent(Event event) {
        return eventsRepository.createEvent(event);
    }
}
