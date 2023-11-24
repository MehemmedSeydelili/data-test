package com.example.datatest.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data

@Table(name = "API_REQUEST_HISTORY")
public class ApiRequestDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "REQUEST", columnDefinition = "VARCHAR2(255)")
    private String request;

    @Column(name = "REQUEST_METHOD", columnDefinition = "VARCHAR2(255)")
    private String requestMethod;

    @Column(name = "RESPONSE", columnDefinition = "CLOB")
    private String response;

    @Column(name = "DATE", columnDefinition = "DATE")
    private LocalDate date;

    @Column(name = "MESSAGE", columnDefinition = "VARCHAR2(255)")
    private String message;


    public ApiRequestDetails() {
    }

    public ApiRequestDetails(Long id, String request, String requestMethod, String response, LocalDate date, String message) {
        this.id = id;
        this.request = request;
        this.requestMethod = requestMethod;
        this.response = response;
        this.date = date;
        this.message = message;
    }
}
