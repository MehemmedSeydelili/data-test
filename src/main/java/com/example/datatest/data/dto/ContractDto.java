package com.example.datatest.data.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ContractDto {

    private LocalDate beginDate;
    private LocalDate signDate;
    private LocalDate insertDate;
    private LocalDate endDate;
    private LocalDate nextEndDate;
    private String number;

}
