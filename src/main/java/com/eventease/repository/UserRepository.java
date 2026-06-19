package com.eventease.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eventease.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}