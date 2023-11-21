package com.example.datatest.model.actdeactive;

import com.example.datatest.model.entity.Employee;
import com.example.datatest.model.entity.Employer;
import com.example.datatest.model.entity.Contract;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Active {

    @JsonProperty("Employer")
    private Employer employer;

    @JsonProperty("Employee")
    private Employee employee;

    @JsonProperty("Contract")
    private Contract contract;
}
