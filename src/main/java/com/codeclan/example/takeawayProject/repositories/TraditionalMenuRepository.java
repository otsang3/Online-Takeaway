package com.codeclan.example.takeawayProject.repositories;

import com.codeclan.example.takeawayProject.models.TraditionalMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TraditionalMenuRepository extends JpaRepository<TraditionalMenu, Long> {
}
