package com.EducationalPractice.PlaceCar.repository;

import com.EducationalPractice.PlaceCar.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long>  {
}
