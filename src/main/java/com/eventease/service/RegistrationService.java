package com.eventease.service;

import java.util.List;
import com.eventease.entity.Registration;

public interface RegistrationService {

    Registration registerUser(Long userId, Long eventId);

    List<Registration> getRegistrationsByEvent(Long eventId);
}