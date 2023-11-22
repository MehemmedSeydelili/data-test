package com.example.datatest.data.activedeactive;

import com.example.datatest.data.entity.Employee;
import com.example.datatest.data.entity.Employer;
import com.example.datatest.data.entity.Contract;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "deactives")
public class DeactiveList {

    /*List<Deactive> deactives;*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contract_id")
    private Contract contract;
}