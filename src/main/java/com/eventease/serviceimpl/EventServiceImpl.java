package com.eventease.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventease.entity.Event;
import com.eventease.repository.EventRepository;
import com.eventease.service.EventService;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepo;

    @Override
    public Event createEvent(Event event) {

        if (event.getTitle() == null ||
                event.getTitle().trim().isEmpty()) {

            throw new RuntimeException("Event title cannot be empty");
        }

        return eventRepo.save(event);
    }

}
