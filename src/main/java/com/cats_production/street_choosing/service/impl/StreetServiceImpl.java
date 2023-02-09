package com.cats_production.street_choosing.service.impl;

import com.cats_production.street_choosing.entity.Street;
import com.cats_production.street_choosing.repository.StreetRepository;
import com.cats_production.street_choosing.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetServiceImpl implements StreetService {

    @Autowired
    private StreetRepository streetRepository;


    @Override
    public Street getRandomNotVisitedStreet() {
        return streetRepository.getRandomNotVisitedStreet();
    }

    @Override
    public void setAsVisited(Integer id) {
        Street street = streetRepository.getReferenceById(id);
        street.setVisited(true);
        streetRepository.save(street);
    }

    @Override
    public List<Street> getVisitedStreets() {
        List<Street> visitedStreets = streetRepository.getVisitedStreets();
        return visitedStreets;
    }
}
