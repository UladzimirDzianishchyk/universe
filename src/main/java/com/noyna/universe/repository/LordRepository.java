package com.noyna.universe.repository;

import com.noyna.universe.entity.Lord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LordRepository extends JpaRepository<Lord, Long> {

    List<Lord> findByPlanetsIsNull();

}
