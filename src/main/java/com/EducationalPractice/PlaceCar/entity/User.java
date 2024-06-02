package com.EducationalPractice.PlaceCar.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
@Table(name = "users")
@Schema(description = "Инфа о госте парковки")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser; //индивид. номер гостя парковки
    @NotBlank()
    @Pattern(regexp = "[0-9]{2}-[0-9]{2}-[0-9]{4}\\s[0-9]{2}:[0-9]{2}")
    @Schema(description = "Время въезда ", example = "dd-MM-yyyy HH:mm")
    private LocalDateTime timeEntry; //Время въезда
    @NotBlank()
    @Pattern(regexp = "[0-9]{2}-[0-9]{2}-[0-9]{4}\\s[0-9]{2}:[0-9]{2}")
    @Schema(description = "Время выезда ", example = "dd-MM-yyyy HH:mm")
    private LocalDateTime timeDeparture; //Время выезда

    @NotNull
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Card> cardList;
    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Car> carList;
    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<PM> pmList;
    @Override
    public String toString() {
        return "";
    }
}




    /*
    import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Period;

LocalDateTime startTime = LocalDateTime.of(timeEntry);
LocalDateTime endTime = LocalDateTime.of(timeDeparture);

Duration продолжительность = Duration.between(startTime, endTime);
Period период = Period.between(startTime.toLocalDate(), endTime.toLocalDate());
     */