package com.example.movie_streaming.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Movie movie;

    @Min(value = 1, message = "Rating must be at least 1")
    @Max(value = 10, message = "Rating must be at most 10")
    private int value;


    public Rating() {}

    public Rating(User user, Movie movie, int value) {
        this.user = user;
        this.movie = movie;
        this.value = value;
    }

    public Long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }

    public User getUser(){
        return user;
    }
    public void setUser(){
        this.user=user;
    }

    public  Movie getMovie(){
        return movie;
    }
    public void setMovie(){
        this.movie=movie;
    }


    public int getValue(){
        return  value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
