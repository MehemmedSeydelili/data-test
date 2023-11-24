package com.example.datatest.service.impl;

import com.example.datatest.data.entity.ApiRequestDetails;
import com.example.datatest.repository.ApiRequestDetailsRepository;
import com.example.datatest.service.ApiRequestDetailsService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ApiRequestDetailsServiceImpl implements ApiRequestDetailsService {

    private final ApiRequestDetailsRepository apiRequestDetailsRepository;
    ApiRequestDetails details = new ApiRequestDetails();

    @Override
    public void saveRequestDetails(HttpServletRequest request, HttpServletResponse response) {
        this.details.setRequest(request.getRequestURI());
        this.details.setRequestMethod(request.getMethod());
        this.details.setDate(LocalDate.from(LocalDateTime.now()));
        this.details.setMessage("This is message");
        this.details.setResponse("This is Response");

        apiRequestDetailsRepository.save(details);
    }
}
