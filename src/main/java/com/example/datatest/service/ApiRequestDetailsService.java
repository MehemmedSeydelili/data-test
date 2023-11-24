package com.example.datatest.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface ApiRequestDetailsService {

    void saveRequestDetails(HttpServletRequest request, HttpServletResponse response);

}
