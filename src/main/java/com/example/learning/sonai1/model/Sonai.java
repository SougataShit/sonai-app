package com.example.learning.sonai1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Sonai {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;

    public Sonai(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Sonai() {
    }

    @Override
    public String toString() {
        return "Sonai [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    
}
