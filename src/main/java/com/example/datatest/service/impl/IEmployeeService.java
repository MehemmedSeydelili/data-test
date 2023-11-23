package com.example.datatest.service.impl;

import com.example.datatest.data.dto.EmployeeDto;
import com.example.datatest.data.entity.Employee;
import com.example.datatest.data.type.Type;
import com.example.datatest.mapper.EmployeeMapper;
import com.example.datatest.mapper.TypeMapper;
import com.example.datatest.repository.EmployeeRepository;
import com.example.datatest.service.EmployeeService;
import com.example.datatest.service.TypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class IEmployeeService implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final TypeService typeService;

    @Override
    public EmployeeDto create(EmployeeDto dto) {

        Type type = TypeMapper.INSTANCE.mapDtoToEntity(typeService.getById(dto.getTypeId()));

        Employee employee = EmployeeMapper.INSTANCE.mapDtoToEntity(dto);
        //employee.setType(type);
        employeeRepository.save(employee);
        return EmployeeMapper.INSTANCE.mapEntityToDto(employee);
    }

    @Override
    public Optional<EmployeeDto> getById(Long id) {
        return Optional.ofNullable(EmployeeMapper.INSTANCE.mapEntityToDto(fetchEmployeeIfExist(id)));
    }

    private Employee fetchEmployeeIfExist(Long id){
        return employeeRepository.findById(id).orElseThrow(()->
                new RuntimeException("Not found employee for this ID"));
    }
}
