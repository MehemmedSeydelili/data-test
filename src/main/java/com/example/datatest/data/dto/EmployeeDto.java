package com.example.datatest.data.dto;

import lombok.Data;

@Data
public class EmployeeDto {

    private String name;
    private String surname;
    private String patronymic;
    private Object phone;
    private String workPlace;
    private String position;
    private Double salary;
    private String sSN;

}
