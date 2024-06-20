package com.EducationalPractice.PlaceCar.repository;

import com.EducationalPractice.PlaceCar.entity.AboutHuman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AboutHumanRepo extends JpaRepository<AboutHuman, Long> {

}

