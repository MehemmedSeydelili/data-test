package com.example.datatest.model.type;

import com.example.datatest.model.entity.Contract;
import com.example.datatest.model.entity.Employee;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "work_casual_types")
public class WorkCasualType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty("Label")
    public String label;
    @JsonProperty("Description")
    public String description;

    @OneToMany(mappedBy = "workCasualType",cascade = CascadeType.ALL)
    private List<Employee> employees;
}
