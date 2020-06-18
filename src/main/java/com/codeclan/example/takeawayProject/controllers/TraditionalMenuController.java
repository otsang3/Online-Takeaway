package com.codeclan.example.takeawayProject.controllers;

import com.codeclan.example.takeawayProject.models.TraditionalMenu;
import com.codeclan.example.takeawayProject.repositories.TraditionalMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TraditionalMenuController {

    @Autowired
    TraditionalMenuRepository traditionalMenuRepository;

    @GetMapping(value = "/traditionalMenu")
    public ResponseEntity<List<TraditionalMenu>> getAllTraditionalMenu(){
        return new ResponseEntity<>(traditionalMenuRepository.findAll(), HttpStatus.OK);
    }
}
