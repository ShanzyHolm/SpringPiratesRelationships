package com.example.codeclan.pirateservice.controllers;


import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Ship;
import com.example.codeclan.pirateservice.repositories.PirateRepository;
import com.example.codeclan.pirateservice.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/pirates")
public class PirateController {

    @Autowired
    PirateRepository pirateRepository;
    ShipRepository shipRepository;

    @GetMapping
    public List<Pirate> getAllPirates(){
        return pirateRepository.findAll();
    }

    @GetMapping
    public List<Ship>getAllShips() {
        return shipRepository.findAll();
    }

    @PostMapping
    public void setPirates(){

    }

}
