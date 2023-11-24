package com.example.datatest.data.response;

import com.example.datatest.data.entity.activedeactive.Active;
import com.example.datatest.data.entity.activedeactive.Deactive;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  /*  @OneToMany(mappedBy = "response")
    List<Active> actives;

    @OneToMany(mappedBy = "response")
    List<Deactive> deactives;*/
}
