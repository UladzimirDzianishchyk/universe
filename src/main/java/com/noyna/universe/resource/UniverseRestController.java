package com.noyna.universe.resource;

import com.noyna.universe.entity.Lord;
import com.noyna.universe.entity.Planet;
import com.noyna.universe.service.LordService;
import com.noyna.universe.service.PlanetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UniverseRestController {

    private final LordService lordService;
    private final PlanetService planetService;

    public UniverseRestController(LordService lordService, PlanetService planetService) {
        this.lordService = lordService;
        this.planetService = planetService;
    }


    @PostMapping(path = "/createLord")
    public ResponseEntity<Lord> createLord(@RequestBody Lord lord) {
        lordService.create(lord);
        return new ResponseEntity<>(lordService.getLordById(lord.getId()), HttpStatus.CREATED);
    }

    @PostMapping(path = "/createPlanet")
    public ResponseEntity<Planet> crestePlanet(@RequestBody Planet planet) {
        planetService.create(planet);
        return new ResponseEntity<>(planetService.getPlanetById(planet.getId()), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "deletPlanetById")
    public ResponseEntity<String> deletePlanetById(@RequestBody Planet planet){
        String s = "Planet " + planetService.getPlanetById(planet.getId()).getName() + " deleted";
        planetService.deletePlanet(planet.getId());
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    @GetMapping(path = "findIdlers")
    public ResponseEntity<List<Lord>> findIdlers(){
        return new ResponseEntity<>(lordService.findIdlers(),HttpStatus.OK);
    }

}
