package com.example.demo.repository;

import com.example.demo.ScriptEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScriptRepository extends JpaRepository<ScriptEntity, Long> {
}
