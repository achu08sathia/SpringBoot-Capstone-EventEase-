package com.eventease.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eventease.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}