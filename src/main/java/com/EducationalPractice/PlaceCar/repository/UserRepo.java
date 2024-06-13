package com.EducationalPractice.PlaceCar.repository;

import com.EducationalPractice.PlaceCar.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long>  {
}

