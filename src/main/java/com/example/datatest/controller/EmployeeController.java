package com.example.datatest.controller;

import com.example.datatest.data.dto.EmployeeDto;
import com.example.datatest.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v2/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.status(HttpStatus.OK).body("hello");
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Optional<EmployeeDto>> getById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<EmployeeDto> create(@RequestBody EmployeeDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.create(dto));
    }

}
