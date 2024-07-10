package com.example.demo.repository;

import com.example.demo.ConsentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsentRepository extends JpaRepository<ConsentEntity, Long> {
}
