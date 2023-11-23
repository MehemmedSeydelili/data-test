package com.example.datatest.data.type;

import com.example.datatest.data.entity.Contract;
import com.example.datatest.data.entity.Employee;
import com.example.datatest.data.entity.Employer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "GENERALTYPES")
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "LABEL", columnDefinition = "VARCHAR2(255)")
    public String label;

    @Column(name = "DESCRIPTION", columnDefinition = "VARCHAR2(1000)")
    public String description;

    @OneToMany(mappedBy = "type",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Contract> contracts;

    @OneToMany(mappedBy = "type",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Employee> employees;

    @OneToMany(mappedBy = "type",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Employer> employers;
}
