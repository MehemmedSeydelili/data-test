package com.example.datatest.data.response;

import com.example.datatest.data.ApiStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponse {

    private Object requestIdentifier;
    private ApiStatus apiStatus;
    private Response response;

}
