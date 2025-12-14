package com.example.learning.sonai1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learning.sonai1.model.Sonai;

public interface SonaiRepository extends JpaRepository<Sonai, Integer> {
    
}
