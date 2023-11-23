package com.example.datatest.data.entity;

import com.example.datatest.data.activedeactive.Active;
import com.example.datatest.data.type.Type;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@Table(name = "CONTRACTS")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "BEGIN_DATE", columnDefinition = "DATE")
    private Date beginDate;

    @Column(name = "SIGN_DATE", columnDefinition = "DATE")
    private Date signDate;

    @Column(name = "INSERT_DATE", columnDefinition = "DATE")
    private Date insertDate;

    @Column(name = "END_DATE", columnDefinition = "DATE")
    private Date endDate;

    @Column(name = "TERMINATE_DATE", columnDefinition = "DATE")
    private Date terminateDate;

    @Column(name = "NEXT_END_DATE", columnDefinition = "DATE")
    private Date nextEndDate;

    @Column(name = "NUMBER_COLUMN", columnDefinition = "VARCHAR2(255)")
    private String number;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type_id")
    private Type type;

    @OneToOne(mappedBy = "contract")
    private Active active;

}
