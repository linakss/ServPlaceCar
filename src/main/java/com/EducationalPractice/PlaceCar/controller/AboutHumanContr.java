package com.EducationalPractice.PlaceCar.controller;

import com.EducationalPractice.PlaceCar.entity.AboutHuman;
import com.EducationalPractice.PlaceCar.entity.Car;
import com.EducationalPractice.PlaceCar.response.BaseResp;
import com.EducationalPractice.PlaceCar.response.DataResp;
import com.EducationalPractice.PlaceCar.response.ListResp;
import com.EducationalPractice.PlaceCar.service.AboutHumanServ;
import com.EducationalPractice.PlaceCar.service.CarServ;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name="данные о человеке", description="Содержит методы для работы с данными о человеке ")
@RestController
@RequestMapping("educationalpractice/placecar/abouthuman")
@AllArgsConstructor
public class AboutHumanContr {
    private final AboutHumanServ service;
    @Operation(
            summary = "Вывод всех машин",
            description = "Позволяет вывести все машины, что есть в базе"
    )
    @GetMapping("/all")
    public ResponseEntity<ListResp<AboutHuman>> getAll() {
        return ResponseEntity.ok(
                new ListResp<AboutHuman>(true, "Список машин:", service.findAll()));
    }


    @Operation(
            summary = "Добавить машину",
            description = "Позволяет добавлять машину в базу"
    )
    @PostMapping("/save")
    public ResponseEntity<BaseResp> save(@RequestBody AboutHuman aboutHuman) {
        try {
            return ResponseEntity.ok(
                    new DataResp<AboutHuman>(true, "Машина сохранена", service.save(aboutHuman)));
        } catch (RuntimeException e) {
            return ResponseEntity.ok(
                    new BaseResp(false, e.getMessage()));
        }
    }
    @Operation(
            summary = "Изменить машину",
            description = "Позволяет редактировать и изменять машину"
    )
    @PutMapping("/update")
    public ResponseEntity<BaseResp> update(@RequestBody AboutHuman aboutHuman) {
        try {
            service.update(aboutHuman);
            return ResponseEntity.ok(
                    new BaseResp(true, "Машина сохранена и обновлена"));
        }catch (RuntimeException e) {
            return ResponseEntity.ok(
                    new BaseResp(false, e.getMessage()));

        }

    }

    @Operation(
            summary = "Удалить  машину",
            description = "Позволяет удалить машину из базы"
    )
    @DeleteMapping("del/{id}")
    public ResponseEntity<BaseResp> delete(@PathVariable Long id) {
        try {
            service.delete(id);
            return ResponseEntity.ok(
                    new BaseResp(true, "Машина удалена"));
        } catch (RuntimeException e) {
            return ResponseEntity.ok(
                    new BaseResp(false, e.getMessage()));

        }
    }
}
