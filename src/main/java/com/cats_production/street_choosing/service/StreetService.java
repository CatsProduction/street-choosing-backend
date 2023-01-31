package com.cats_production.street_choosing.service;

import com.cats_production.street_choosing.entity.Street;

public interface StreetService {

    Street getRandomNotVisitedStreet();
    void setAsVisited(Integer id);
}
