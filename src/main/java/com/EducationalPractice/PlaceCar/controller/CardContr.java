package com.EducationalPractice.PlaceCar.controller;

import com.EducationalPractice.PlaceCar.entity.Card;
import com.EducationalPractice.PlaceCar.response.BaseResp;
import com.EducationalPractice.PlaceCar.response.DataResp;
import com.EducationalPractice.PlaceCar.service.CardServ;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name="Карты", description="Содержит методы для работы с картами")
@RestController
@RequestMapping("educationalpractice/placecar/card")
@AllArgsConstructor
public class CardContr {
    private final CardServ service;

    @Operation(
            summary = "Добавить карту",
            description = "Позволяет добавлять карту в базу"
    )
    @PostMapping
    public ResponseEntity<BaseResp> save(@RequestBody Card card) {
        try {
            return ResponseEntity.ok(
                    new DataResp<Card>(true, "Карта сохранена", service.save(card)));
        } catch (RuntimeException e) {
            return ResponseEntity.ok(
                    new BaseResp(false, e.getMessage()));
        }
    }
    @Operation(
            summary = "Изменить карту",
            description = "Позволяет редактировать и изменять карту"
    )
    @PutMapping
    public ResponseEntity<BaseResp> update(@RequestBody Card card) {
        try {
            service.update(card);
            return ResponseEntity.ok(
                    new BaseResp(true, "Карта сохранена и обновлена"));
        }catch (RuntimeException e) {
            return ResponseEntity.ok(
                    new BaseResp(false, e.getMessage()));

        }
    }

    @Operation(
            summary = "Удалить карту",
            description = "Позволяет удалить карту из базы"
    )
    @DeleteMapping("/{id}")
    public ResponseEntity<BaseResp> delete(@PathVariable Long id) {
        try {
            service.delete(id);
            return ResponseEntity.ok(
                    new BaseResp(true, "Карта удалена"));
        } catch (RuntimeException e) {
            return ResponseEntity.ok(
                    new BaseResp(false, e.getMessage()));

        }
    }
}
