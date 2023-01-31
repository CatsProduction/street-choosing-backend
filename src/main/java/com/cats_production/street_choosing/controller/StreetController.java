package com.cats_production.street_choosing.controller;

import com.cats_production.street_choosing.entity.Street;
import com.cats_production.street_choosing.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/streets")
public class StreetController {

    @Autowired
    private StreetService streetService;


    @GetMapping
    public Street getRandomStreet(){
        return streetService.getRandomNotVisitedStreet();
    }

    @PutMapping("/{id}")
    public void setStreetAsVisited(@PathVariable Integer id){
        streetService.setAsVisited(id);
    }
}
