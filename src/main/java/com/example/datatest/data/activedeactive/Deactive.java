package com.example.datatest.data.activedeactive;


import com.example.datatest.data.entity.Contract;
import com.example.datatest.data.entity.Employee;
import com.example.datatest.data.entity.Employer;
import jakarta.persistence.*;

/*@Entity
@Table(name = "actives")*/
public class Deactive {
    private Employer employer;
    private Employee employee;
    private Contract contract;


    /*@Id
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
    private Contract contract;*/
}
