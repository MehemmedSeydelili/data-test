package com.example.datatest.model.type;

import com.example.datatest.model.entity.Contract;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "invalidations")
public class Invalidation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty("Label")
    public String label;
    @JsonProperty("Description")
    public String description;

    @OneToMany(mappedBy = "invalidation",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Contract> contracts;

}
