package com.EducationalPractice.PlaceCar.repository;
import com.EducationalPractice.PlaceCar.entity.Car;
import com.EducationalPractice.PlaceCar.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
