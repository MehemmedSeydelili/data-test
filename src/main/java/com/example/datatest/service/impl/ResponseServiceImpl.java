package com.example.datatest.service.impl;

import com.example.datatest.client.FetchEmployeeClient;
import com.example.datatest.repository.ApiDataRepository;
import com.example.datatest.service.ResponseService;
import feign.Response;
import feign.Util;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.Reader;

@Service
@RequiredArgsConstructor
public class ResponseServiceImpl implements ResponseService {


    private final FetchEmployeeClient fetchEmployeeClient;
    private final ApiDataRepository apiDataRepository;

    @Override
    public String fetchEmployeeInfo(String Apikey){

        String response= String.valueOf(fetchEmployeeClient.getEmployeeInfo(Apikey));
        return response;
    }
}
