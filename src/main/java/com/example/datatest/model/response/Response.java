package com.example.datatest.model.response;

import com.example.datatest.model.actdeactive.Active;
import com.example.datatest.model.actdeactive.Deactive;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Response {
    @JsonProperty("Active")
    List<Active> actives;
    @JsonProperty("Deactive")
    List<Deactive> deactives;
}
