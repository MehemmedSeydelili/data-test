package com.example.datatest.client;

import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@Component
@FeignClient(name = "FetchEmployeeClient", url = "http://test.asanfinance.gov.az:8080/api/v2")
public interface FetchEmployeeClient {

    @GetMapping("/EmployeeInfo/31842PY")
    ResponseEntity<String> getEmployeeInfo(@RequestHeader("Apikey") String value);

}
