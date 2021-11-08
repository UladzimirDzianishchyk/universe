package com.noyna.universe.service;

import com.noyna.universe.entity.Planet;
import com.noyna.universe.repository.PlanetRepository;
import org.springframework.stereotype.Service;

@Service
public class PlanetService {

    private final PlanetRepository planetRepository;

    public PlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public void create(Planet planet){
        planetRepository.save(planet);
    }

    public Planet getPlanetById(long id){
        return planetRepository.getById(id);
    }

    public void deletePlanet(long id){
        planetRepository.getById(id);
    }
}
