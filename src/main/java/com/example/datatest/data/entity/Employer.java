package com.example.datatest.data.entity;

import com.example.datatest.data.activedeactive.Active;
import com.example.datatest.data.type.Type;
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
    @JoinColumn(name = "type_id")
    private Type type;

    @OneToOne(mappedBy = "employer")
    private Active active;

}
