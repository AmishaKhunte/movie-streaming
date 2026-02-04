package com.example.movie_streaming.repository;

import com.example.movie_streaming.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository <Genre,Long>{
}
