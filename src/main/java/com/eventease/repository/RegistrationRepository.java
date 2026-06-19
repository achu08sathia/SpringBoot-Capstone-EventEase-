package com.eventease.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.eventease.entity.Registration;

public interface RegistrationRepository
        extends JpaRepository<Registration, Long> {

    List<Registration> findByEventId(Long eventId);
}