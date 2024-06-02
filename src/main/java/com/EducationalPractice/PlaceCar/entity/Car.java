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
@Table(name = "car")
@Schema(description = "Инфа о машине")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCar; //индивид. номер машины в базе
    @NotBlank()
    @Pattern(regexp = "[А-Я][а-я]{1,20}")
    @Schema(description = "Цвет машины ", example = "Красный")
    private String colorCar; //цвет машины
    @NotBlank()
    @Pattern(regexp = "[А-Я][а-я]{1,25}")
    @Schema(description = "Модель машины ", example = "Audi")
    private String modelCar; //модель машины
    @NotBlank()
    @Schema(description = "Марка машины ", example = "R8")
    private String markCar; //марка машины
    @NotBlank()
    @Pattern(regexp = "[А-Я][0-9]{3}[А-Я]{2}")
    @Schema(description = "Гос.номер машины ", example = "Т161ТС")
    private String gosNumberCar; //государственнный номер машины
    //надо еще накинуть паттерн на гос номер машины чтобы сначала была буква 3 цифры и 2 буквы + регион 3 цифры
}
