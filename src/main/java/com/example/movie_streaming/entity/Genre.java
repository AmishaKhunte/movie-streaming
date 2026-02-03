package com.example.movie_streaming.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @NotBlank
    private String name;

    public Genre(){}

    public Genre(String name){
        this.name=name;
    }

    public String getName(String name){
        return name;
    }

    public void setName(){
        this.name=name;
    }
}
