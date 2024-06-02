package com.EducationalPractice.PlaceCar.service;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@AllArgsConstructor
@Validated
public class userServ {
    /*private final BookRepo repo;
    public List<BookEntity> getTitle(String title){
        return repo.findByTitle(title);
    }

    public List<BookEntity> findAll(){
        return repo.findAll();
    }
    public Optional<BookEntity> findById(Long id){
        return repo.findById(id);
    }
    public BookEntity save(@Valid BookEntity dataBook){
        return repo.save(dataBook);
    }
    public void update(@Valid BookEntity dataBook){
        repo.save(dataBook);
    }
    public void delete(Long id){
        repo.deleteById(id);
    }*/
}
