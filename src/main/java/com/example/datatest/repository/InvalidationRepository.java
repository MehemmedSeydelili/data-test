package com.example.datatest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvalidationRepository extends JpaRepository<Invalidation, Long> {
}
