package com.example.datatest.controller;

import com.example.datatest.data.dto.TypeDto;
import com.example.datatest.service.TypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v2/type")
public class TypeController {

    private final TypeService typeService;

    @GetMapping("/getById/{id}")
    public ResponseEntity<TypeDto> getById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(typeService.getById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<TypeDto> create(@RequestBody TypeDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(typeService.create(dto));
    }
}
