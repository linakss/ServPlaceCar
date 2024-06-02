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
@Table(name = "pm")
@Schema(description = "Инфа о парковочном месте")
public class PM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPM; //индивид. номер парковочного места в базе
    @NotBlank()
    @Pattern(regexp = "[A-Z]")
    @Schema(description = "Ряд ПМ", example = "B")
    private String ryadPM; //ряд парковочного места от A до Z
    @NotBlank()
    @Pattern(regexp = "^\\d+$")
    @Schema(description = "", example = "10")
    private int numberPM; // номер парковочного места от 1 до 10
    @NotBlank()
    @Pattern(regexp = "[А-Я][а-я]{1,20}")
    @Schema(description = "", example = "")
    private String statusPM; // статус парковочного места (свободно, забронировано, занято)

}
