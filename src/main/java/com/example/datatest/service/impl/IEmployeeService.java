package com.example.datatest.service.impl;

import com.example.datatest.data.dto.EmployeeDto;
import com.example.datatest.repository.EmployeeRepository;
import com.example.datatest.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IEmployeeService implements EmployeeService {

    private final EmployeeRepository employeeRepository;


    @Override
    public EmployeeDto create(EmployeeDto dto) {

    }

    @Override
    public EmployeeDto getById(Long id) {
        return null;
    }
}
