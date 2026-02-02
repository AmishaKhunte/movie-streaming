package com.example.movie_streaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.movie_streaming.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {

}
