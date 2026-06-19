package com.eventease.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.eventease.dto.RegistrationDTO;
import com.eventease.entity.Registration;
import com.eventease.service.RegistrationService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {

    @Autowired
    private RegistrationService service;

    @PostMapping
    public Registration registerUser(
            @Valid @RequestBody RegistrationDTO dto) {

        return service.registerUser(
                dto.getUserId(),
                dto.getEventId());
    }

    @GetMapping("/event/{eventId}")
    public List<Registration> getRegistrationsByEvent(
            @PathVariable Long eventId) {

        return service.getRegistrationsByEvent(eventId);
    }

}
