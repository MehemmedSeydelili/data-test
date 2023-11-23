package com.example.datatest.data.entity;

import com.example.datatest.data.activedeactive.Active;
import com.example.datatest.data.type.Type;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "EMPLOYER")
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "VOEN", columnDefinition = "VARCHAR2(255)")
    private String voen;

    @Column(name = "NAME", columnDefinition = "VARCHAR2(255)")
    private String name;

    @Column(name = "WORKER_COUNT", columnDefinition = "NUMBER")
    private Integer workerCount;

    @Column(name = "PHONE", columnDefinition = "VARCHAR2(255)")
    private String phone;

    @Column(name = "LEGAL_ADDRESS", columnDefinition = "VARCHAR2(255)")
    private String legalAddress;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type_id")
    private Type type;

    @OneToOne(mappedBy = "employer")
    private Active active;

}
