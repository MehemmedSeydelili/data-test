package com.example.datatest.model.entity;

import com.example.datatest.model.type.WorkCasualType;
import com.example.datatest.model.type.WorkPlaceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Surname")
    private String surname;
    @JsonProperty("Patronymic")
    private String patronymic;
    @JsonProperty("Phone")
    private Object phone;
    @JsonProperty("WorkPlaceType")

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "wpt_id")
    private WorkPlaceType workPlaceType;

    @JsonProperty("WorkPlace")
    private String workPlace;
    @JsonProperty("Position")
    private String position;

    @JsonProperty("PositionLabourContract")
    @Column(name = "position_labour_contract")
    private String positionLabourContract;

    @JsonProperty("Salary")
    private double salary;

    @JsonProperty("WorkCasualType")
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "wct_id")
    private WorkCasualType workCasualType;

    @JsonProperty("SSN")
    private String sSN;



}
