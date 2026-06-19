package com.eventease.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.eventease.dto.EventDTO;
import com.eventease.entity.Event;
import com.eventease.service.EventService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService service;

    @PostMapping
    public Event createEvent(@Valid @RequestBody EventDTO dto) {

        Event event = new Event();

        event.setTitle(dto.getTitle());
        event.setDescription(dto.getDescription());
        event.setDate(dto.getDate());
        event.setLocation(dto.getLocation());

        return service.createEvent(event);
    }

}
