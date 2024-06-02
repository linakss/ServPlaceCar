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

import java.time.LocalDateTime;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
@Schema(description = "Инфа о госте парковки")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser; //индивид. номер гостя парковки


    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @NotBlank()
    @Pattern(regexp = "[А-Я][а-я]{1,55}")

    /*
    import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Period;

LocalDateTime начало = LocalDateTime.of(2023, 3, 15, 10, 0, 0);
LocalDateTime конец = LocalDateTime.now();

Duration продолжительность = Duration.between(начало, конец);
Period период = Period.between(начало.toLocalDate(), конец.toLocalDate());
     */


    private LocalDateTime monthEntry; //месяц въезда



    private LocalDateTime yearDeparture; //год выезда

    @Override
    public String toString() {
        return "ф";
    }
}
/*

    @NotNull
    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private PublisherEntity publisher;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "genre_id")
    private GenreEntity genre;
    private String year;
 */