package com.example.datatest.model.entity;

import com.example.datatest.model.type.PropertyType;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employers")
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String voen;
    private String name;

    @Column(name = "worker_count")
    private Integer workerCount;
    private String phone;

    @Column(name = "legal_adress")
    private String legalAddress;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "property_type_id")
    private PropertyType propertyType;

}
