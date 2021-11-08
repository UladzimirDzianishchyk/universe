package com.noyna.universe.service;

import com.noyna.universe.entity.Lord;
import com.noyna.universe.repository.LordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LordService {

    private final LordRepository lordRepository;

    public LordService(LordRepository lordRepository) {
        this.lordRepository = lordRepository;
    }

    public void create(Lord lord){
        lordRepository.save(lord);
    }

    public Lord getLordById(long id){
        return lordRepository.getById(id);
    }

    public List<Lord> findIdlers(){
        return lordRepository.findByPlanetsIsNull();

    }

}
