package com.example.datatest.data.response;

import com.example.datatest.data.actdeactive.Active;
import com.example.datatest.data.actdeactive.Deactive;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Response {
    List<Active> actives;
    List<Deactive> deactives;
}
