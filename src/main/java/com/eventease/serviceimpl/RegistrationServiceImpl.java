package com.eventease.serviceimpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventease.entity.Event;
import com.eventease.entity.Registration;
import com.eventease.entity.User;
import com.eventease.exception.ResourceNotFoundException;
import com.eventease.repository.EventRepository;
import com.eventease.repository.RegistrationRepository;
import com.eventease.repository.UserRepository;
import com.eventease.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private EventRepository eventRepo;

    @Override
    public Registration registerUser(Long userId, Long eventId) {

        User user = userRepo.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        Event event = eventRepo.findById(eventId)
                .orElseThrow(() -> new ResourceNotFoundException("Event not found"));

        Registration registration = new Registration();

        registration.setUser(user);
        registration.setEvent(event);
        registration.setRegistrationDate(LocalDate.now());

        return registrationRepo.save(registration);
    }

    @Override
    public List<Registration> getRegistrationsByEvent(Long eventId) {
        return registrationRepo.findByEventId(eventId);
    }

}
