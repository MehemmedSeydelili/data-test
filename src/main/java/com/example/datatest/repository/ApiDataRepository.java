package com.example.datatest.repository;

import com.example.datatest.data.entity.ApiData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiDataRepository extends JpaRepository<ApiData,Long> {
}
