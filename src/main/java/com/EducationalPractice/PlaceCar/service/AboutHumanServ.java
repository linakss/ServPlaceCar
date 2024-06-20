package com.EducationalPractice.PlaceCar.service;

import com.EducationalPractice.PlaceCar.entity.AboutHuman;
import com.EducationalPractice.PlaceCar.repository.AboutHumanRepo;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Validated
public class AboutHumanServ {
    private final AboutHumanRepo repo;
    public List<AboutHuman> findAll(){
        return repo.findAll();
    }
    public Optional<AboutHuman> findById(Long id){
        return repo.findById(id);
    }
    public AboutHuman save(@Valid AboutHuman dataAboutHuman){
        return repo.save(dataAboutHuman);
    }
    public void update(@Valid AboutHuman dataAboutHuman){
        repo.save(dataAboutHuman);
    }
    public void delete(Long id){
        repo.deleteById(id);
    }
}
