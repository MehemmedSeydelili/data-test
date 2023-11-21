package com.example.datatest.model.entity;

import com.example.datatest.model.Status;
import com.example.datatest.model.type.Invalidation;
import com.example.datatest.model.type.PeriodType;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "contracts")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "begin_date")
    @JsonProperty("BeginDate")
    private Date beginDate;

    @Column(name = "sign_date")
    @JsonProperty("SignDate")
    private Date signDate;

    @Column(name = "insert_date")
    @JsonProperty("InsertDate")
    private Date insertDate;

    @Column(name = "end_date")
    @JsonProperty("EndDate")
    private Date endDate;

    @Column(name = "next_end_date")
    @JsonProperty("NextEndDate")
    private Date nextEndDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "periodtype_id")
    private PeriodType periodType;

    @JsonProperty("Number")
    private String number;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "status_id")
    private Status status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "invalidation_id")
    private Invalidation invalidation;

}
