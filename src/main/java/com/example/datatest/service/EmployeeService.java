package com.example.datatest.service;

import com.example.datatest.data.dto.EmployeeDto;
import com.example.datatest.data.entity.Employee;

import java.util.Optional;

public interface EmployeeService {

    EmployeeDto create(EmployeeDto dto);
    Optional<EmployeeDto> getById(Long id);

}
