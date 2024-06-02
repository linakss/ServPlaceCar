package com.EducationalPractice.PlaceCar.repository;
import com.EducationalPractice.PlaceCar.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
