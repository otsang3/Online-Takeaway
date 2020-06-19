package com.codeclan.example.takeawayProject.repositories;

import com.codeclan.example.takeawayProject.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
