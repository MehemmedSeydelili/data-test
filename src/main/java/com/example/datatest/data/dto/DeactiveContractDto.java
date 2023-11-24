package com.example.datatest.data.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DeactiveContractDto {

    private LocalDate beginDate;
    private LocalDate endDate;

}
