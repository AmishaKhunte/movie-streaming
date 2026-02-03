package com.example.movie_streaming.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name= "movies")
public class Movie {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message ="Title must not be empty")
    private String title;

    @NotBlank(message ="Genre must not be empty")
    private String genre;

    @NotNull(message="Release year is required")
    @Min(value=1900, message = "Release year must be after 1900")
    private int releaseYear;

    @DecimalMin(value="0.0",message="Rating must be at least 0")
    @DecimalMax(value = "10.0",message= "Rating must be at most 10")
    private double rating;

    public Movie() {

    }

    public Movie(String title, String genre, int releaseYear, double rating) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;

    }

    public long getId() {
        return id;

    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {

        this.title=title;
    }

    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }

    public int getReleaseYear(){
        return releaseYear;
    }
    public void setReleaseYear (int releaseYear){
        this.releaseYear= releaseYear;
    }

    public double getRating(){
        return rating;
    }
    public void setRating(double rating){
        this.rating = this.rating;
    }
}
