package com.example.learning.sonai1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learning.sonai1.model.Sonai;
import com.example.learning.sonai1.repository.SonaiRepository;

@RestController
public class SonaiController {

    @Autowired
    private SonaiRepository repository;
    
    @GetMapping("/getStudents")
    public List<Sonai> getStudents() {
        return repository.findAll();
    }
}
