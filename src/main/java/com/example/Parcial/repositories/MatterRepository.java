package com.example.Parcial.repositories;

import com.example.Parcial.entities.Matter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatterRepository extends JpaRepository<Matter, Integer> {

}
