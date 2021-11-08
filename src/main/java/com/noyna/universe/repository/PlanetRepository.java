package com.noyna.universe.repository;

import com.noyna.universe.entity.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository<Planet,Long> {

}
