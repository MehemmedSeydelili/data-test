package com.example.datatest.data.entity;

import com.example.datatest.data.type.Type;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "contracts")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "begin_date")
    private LocalDate beginDate;

    @Column(name = "sign_date")
    private LocalDate signDate;

    @Column(name = "insert_date")
    private LocalDate insertDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "next_end_date")
    private LocalDate nextEndDate;

    private String number;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type_id")
    private Type type;

}
