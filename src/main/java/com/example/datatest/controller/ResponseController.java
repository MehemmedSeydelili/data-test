package com.example.datatest.controller;

import com.example.datatest.service.ResponseService;
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

        @GetMapping("/getEmployeeInfo")
    public ResponseEntity<String> getEmployeeInfo(String Apikey){
        String employeeInfo = responseService.fetchEmployeeInfo(Apikey);
        return ResponseEntity.ok(employeeInfo);
    }
}
