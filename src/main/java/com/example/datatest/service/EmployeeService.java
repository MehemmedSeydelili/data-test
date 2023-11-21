package com.example.datatest.service;

import com.example.datatest.data.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto create(EmployeeDto dto);
    EmployeeDto getById(Long id);

}
