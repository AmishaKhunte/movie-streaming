package com.example.movie_streaming.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="watch_history")
public class WatchHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "movie_id",nullable =false)
    private Movie movie;

    private LocalDateTime watchedAt;

    public WatchHistory(){
        this.watchedAt= LocalDateTime.now();
    }

    public Long getId(){
        return id;
    }

    public User getUser(){
        return user;
    }
    public  void setUser(User user){
        this.user = user;
    }

    public void setMovie(Movie movie){
        this.movie= movie;
    }

    public LocalDateTime getWatchedAt(){
        return watchedAt;
    }

    public void setWatchedAt(LocalDateTime watchedAt){
        this.watchedAt = watchedAt;
    }
}
