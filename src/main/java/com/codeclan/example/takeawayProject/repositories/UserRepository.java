package com.codeclan.example.takeawayProject.repositories;

import com.codeclan.example.takeawayProject.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
