package com.example.Parcial.controllers;

import com.example.Parcial.entities.Matter;
import com.example.Parcial.services.MatterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class MatterController {

    @Autowired
    private MatterService matterService;

    public MatterController(MatterService matterService){
        this.matterService =matterService;
    }

    @GetMapping
    public List<Matter> getMeet(){
        return matterService.getMatter();
    }

    @GetMapping("/{id}")
    public Matter findById(@PathVariable int id){
        return matterService.findById(id);
    }

    @PostMapping
    public Matter save(@RequestBody Matter matter){
        return matterService.save(matter);
    }

    @PutMapping("/{id}")
    public Matter update(@RequestBody Matter matter, @PathVariable int id){
        return matterService.update(matter);
    }

    @DeleteMapping("/{id}")
    public Matter delete(@PathVariable("id") int id){
        return matterService.delete(id);
    }
}
