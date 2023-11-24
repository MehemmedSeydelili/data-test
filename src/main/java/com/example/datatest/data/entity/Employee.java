package com.example.datatest.data.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "EMPLOYEES")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PIN", columnDefinition = "VARCHAR2(255)")
    private String pin;

    @Column(name = "NAME", columnDefinition = "VARCHAR2(255)")
    private String name;

    @Column(name = "SURNAME", columnDefinition = "VARCHAR2(255)")
    private String surname;

    @Column(name = "PATRONYMIC", columnDefinition = "VARCHAR2(255)")
    private String patronymic;

    @Column(name = "PHONE", columnDefinition = "VARCHAR2(255)")
    private String phone;

    @Column(name = "WORK_PLACE", columnDefinition = "VARCHAR2(255)")
    private String workPlace;

    @Column(name = "POSITION", columnDefinition = "VARCHAR2(255)")
    private String position;

    @Column(name = "POSITION_LABOUR_CONTRACT", columnDefinition = "VARCHAR2(255)")
    private String positionLabourContract;

    @Column(name = "SALARY", columnDefinition = "NUMBER")
    private Double salary;

    @Column(name = "SSN", columnDefinition = "VARCHAR2(255)")
    private String sSN;

   /* @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type_id")
    private Type type;

    @OneToOne(mappedBy = "employee")
    private Active active;

    @OneToMany(mappedBy = "employee")
    private List<Employer> employers;

    @OneToMany(mappedBy = "contract")
    private List<Contract> contracts;*/

}
