package com.example.datatest.controller;

import com.example.datatest.service.ApiRequestDetailsService;
import com.example.datatest.service.ResponseService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Reader;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ResponseController {

    private final ResponseService responseService;
    private final ApiRequestDetailsService apiRequestDetailsService;

    @GetMapping("/getEmployeeInfo")
    public ResponseEntity<String> getEmployeeInfo(String Apikey,
                                                  HttpServletRequest request,
                                                  HttpServletResponse response){
        apiRequestDetailsService.saveRequestDetails(request,response);
        String employeeInfo = responseService.fetchEmployeeInfo(Apikey);
        return ResponseEntity.ok(employeeInfo);
    }
}
