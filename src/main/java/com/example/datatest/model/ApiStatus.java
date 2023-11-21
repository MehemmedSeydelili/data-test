package com.example.datatest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiStatus {

    @JsonProperty("Name")
    private String name;
    @JsonProperty("Code")
    private Integer code;
    @JsonProperty("Message")
    private String message;


}
