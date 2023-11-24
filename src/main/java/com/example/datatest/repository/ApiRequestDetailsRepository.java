package com.example.datatest.repository;

import com.example.datatest.data.entity.ApiRequestDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiRequestDetailsRepository extends JpaRepository<ApiRequestDetails,Long> {
}
