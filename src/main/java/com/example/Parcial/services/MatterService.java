package com.example.Parcial.services;

import com.example.Parcial.entities.Matter;
import com.example.Parcial.repositories.MatterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatterService {

    @Autowired
    private MatterRepository matterRepository;

    public MatterService(MatterRepository matterRepository) {
        this.matterRepository = matterRepository;
    }

    public List<Matter> getMatter() {
        return matterRepository.findAll();
    }

    public Matter save(Matter matter){
        return matterRepository.save(matter);
    }

    public  Matter findById(int id){
        Optional<Matter> opMatter= matterRepository.findById(id);
        return opMatter.isPresent() ? opMatter.get() : null;
    }


    public Matter update(Matter matter){

        Optional<Matter> e = matterRepository.findById(matter.getCode());
        if (!e.isEmpty()){

        }
        return null;
    }

    public  Matter delete(int id){
        Matter matter = findById(id);
        if (matter != null){
             matterRepository.delete(matter);
        }
        return  matter;
    }

}
