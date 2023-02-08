package com.cats_production.street_choosing.repository;

import com.cats_production.street_choosing.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface StreetRepository extends JpaRepository<Street, Integer> {

    @Query("SELECT s FROM Street s " +
                    "WHERE s.visited=false " +
            "ORDER BY RANDOM() " +
            "LIMIT 1 ")
    Street getRandomNotVisitedStreet();

    @Query("Select s from Street s where s.visited=true")
    ArrayList<Street> getVisitedStreets();
}
