package com.EducationalPractice.PlaceCar.repository;

import com.EducationalPractice.PlaceCar.entity.Car;
import com.EducationalPractice.PlaceCar.entity.PM;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PMRepo extends JpaRepository<PM, Long>  {
    List<PM> findByRyadPMAndNumberPM(String title);

}
