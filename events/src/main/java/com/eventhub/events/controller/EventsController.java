package com.eventhub.events.controller;

import java.util.List;

import com.eventhub.events.model.Event;
import com.eventhub.events.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eventhub.events.repository.EventsRepository;

@RestController
@RequestMapping("/api/events")
public class EventsController {
    private final EventService eventService;

    @Autowired
    public EventsController(EventsRepository eventsRepository) {
        this.eventService = new EventService(eventsRepository);
    }

    @GetMapping("/{eventId}")
    public ResponseEntity<Event> getEventById(@PathVariable String eventId) {
        Event event = eventService.getEventById(eventId);
        return (event != null) ? ResponseEntity.ok(event) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Event>> getAllEvents() {
        return ResponseEntity.ok(eventService.getAllEvents());
    }

    @PostMapping
    public ResponseEntity<Event> createEvent(@RequestBody Event event) {
        eventService.createEvent(event);
        return ResponseEntity.ok(event);
    }
}
