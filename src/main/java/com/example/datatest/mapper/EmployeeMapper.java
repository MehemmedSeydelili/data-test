package com.example.datatest.mapper;

import com.example.datatest.data.dto.EmployeeDto;
import com.example.datatest.data.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    Employee mapDtoToEntity(EmployeeDto dto);
    EmployeeDto mapEntityToDto(Employee employee);


}
