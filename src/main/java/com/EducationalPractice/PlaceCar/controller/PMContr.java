package com.EducationalPractice.PlaceCar.controller;

import com.EducationalPractice.PlaceCar.entity.PM;
import com.EducationalPractice.PlaceCar.response.BaseResp;
import com.EducationalPractice.PlaceCar.response.DataResp;
import com.EducationalPractice.PlaceCar.response.ListResp;
import com.EducationalPractice.PlaceCar.service.PMServ;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name="Парковочные места", description="Содержит методы для работы с парковочными местами ")
@RestController
@RequestMapping("educationalpractice/placecar/pm")
@AllArgsConstructor
public class PMContr {
    private final PMServ service;
    @Operation(
            summary = "Вывод всех парковочных мест",
            description = "Позволяет вывести всех парковочных мест, что есть в базе"
    )
    @GetMapping("/all")
    public ResponseEntity<ListResp<PM>> getAll() {
        return ResponseEntity.ok(
                new ListResp<PM>(true, "Список парковочных мест:", service.findAll()));
    }


    @Operation(
            summary = "Добавить парковочное место",
            description = "Позволяет добавлять парковочное место в базу"
    )
    @PostMapping
    public ResponseEntity<BaseResp> save(@RequestBody PM pm) {
        try {
            return ResponseEntity.ok(
                    new DataResp<PM>(true, "Машина сохранена", service.save(pm)));
        } catch (RuntimeException e) {
            return ResponseEntity.ok(
                    new BaseResp(false, e.getMessage()));
        }
    }
    @Operation(
            summary = "Изменить парковочное место",
            description = "Позволяет редактировать и изменять парковочное место"
    )
    @PutMapping
    public ResponseEntity<BaseResp> update(@RequestBody PM pm) {
        try {
            service.update(pm);
            return ResponseEntity.ok(
                    new BaseResp(true, "Машина сохранена и обновлена"));
        }catch (RuntimeException e) {
            return ResponseEntity.ok(
                    new BaseResp(false, e.getMessage()));

        }
    }

    @Operation(
            summary = "Удалить парковочное место",
            description = "Позволяет удалить парковочное место из базы"
    )
    @DeleteMapping("/{id}")
    public ResponseEntity<BaseResp> delete(@PathVariable Long id) {
        try {
            service.delete(id);
            return ResponseEntity.ok(
                    new BaseResp(true, "Парковочное место удалена"));
        } catch (RuntimeException e) {
            return ResponseEntity.ok(
                    new BaseResp(false, e.getMessage()));

        }
    }
}
