package com.EducationalPractice.PlaceCar.repository;

import com.EducationalPractice.PlaceCar.entity.Car;
import com.EducationalPractice.PlaceCar.entity.PM;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PMRepo extends JpaRepository<PM, Long>  {
    Optional<PM> findByRyadPMAndNumberPM(String ryadPM, String numberPM);

}
