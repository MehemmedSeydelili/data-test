package com.example.datatest.model.response;

import com.example.datatest.model.ApiStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponse {

    @JsonProperty("RequestIdentifier")
    private Object requestIdentifier;
    @JsonProperty("ApiStatus")
    private ApiStatus apiStatus;
    @JsonProperty("Response")
    private Response response;

}
