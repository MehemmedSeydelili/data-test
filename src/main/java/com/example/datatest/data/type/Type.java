package com.example.datatest.data.type;

import com.example.datatest.data.entity.Contract;
import com.example.datatest.data.entity.Employee;
import com.example.datatest.data.entity.Employer;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "types")
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String label;
    public String description;

    @OneToMany(mappedBy = "type",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Contract> contracts;

    @OneToMany(mappedBy = "type",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Employee> employees;

    @OneToMany(mappedBy = "type",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Employer> employers;

}
