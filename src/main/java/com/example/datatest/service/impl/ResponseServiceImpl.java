package com.example.datatest.service.impl;

import com.example.datatest.client.FetchEmployeeClient;
import com.example.datatest.service.ApiRequestDetailsService;
import com.example.datatest.service.ResponseService;
import feign.Response;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
@RequiredArgsConstructor
public class ResponseServiceImpl implements ResponseService {


    private final FetchEmployeeClient fetchEmployeeClient;
    private final ApiRequestDetailsService apiRequestDetailsService;

    @Override
    public String fetchEmployeeInfo(String Apikey) {

        //apiRequestDetailsService.saveRequestDetails();
        Response feignResponse = fetchEmployeeClient.getEmployeeInfo(Apikey);
        return convert(feignResponse);

    }


    private String convert(Response feignResponse){

        String responseBody = null;
        try {
            if (feignResponse.body() != null) {
                responseBody = IOUtils.toString(feignResponse.body().asInputStream(), StandardCharsets.UTF_8);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return responseBody;
    }
}


