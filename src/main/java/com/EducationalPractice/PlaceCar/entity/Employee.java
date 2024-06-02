package com.EducationalPractice.PlaceCar.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
@Schema(description = "Инфа о сотруднике")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmployee; //индивид. номер сотрудника системы в базе
    @NotBlank()
    @Pattern(regexp = "[А-Я][а-я]{1,20}")
    @Schema(description = "Отчество сотрудника ", example = "Павлович")
    private String lastname; //отчество сотрудника системы
    @NotBlank()
    @Pattern(regexp = "[А-Я][а-я]{1,20}")
    @Schema(description = "Имя сотрудника ", example = "Максим")
    private String name; //имя сотрудника системы
    @NotBlank()
    @Pattern(regexp = "[А-Я][а-я]{1,20}")
    @Schema(description = "Фамилия сотрудника ", example = "Аверьянов")
    private String surname; //фамилия сотрудника системы
    @NotBlank()
    @Pattern(regexp = "[А-Я][а-я]{1,20}")
    @Schema(description = "Роль сотрудника ", example = "Администратор")
    private String role; //роль сотрудника системы
    @NotBlank()
    @Pattern(regexp = "8\\s([0-9]{3})\\s[0-9]{3}-[0-9]{2}-[0-9]{2}")
    @Schema(description = "Номер телефона сотрудника ", example = "8 (928) 456-21-30")
    private int numberPhone; // номер телефона сотрудника


}
