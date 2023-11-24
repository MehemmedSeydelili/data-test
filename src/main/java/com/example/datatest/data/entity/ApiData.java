package com.example.datatest.data.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "API_RESPONSE")
public class ApiData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DATA", columnDefinition = "CLOB")
    private String data;
}