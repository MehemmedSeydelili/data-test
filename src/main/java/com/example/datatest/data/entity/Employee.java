package com.example.datatest.data.entity;

import com.example.datatest.data.type.Type;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pin;

    private String name;
    private String surname;
    private String patronymic;
    private Object phone;
    private String workPlace;
    private String position;

    @Column(name = "position_labour_contract")
    private String positionLabourContract;

    private Double salary;

    private String sSN;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type_id")
    private Type type;

}
