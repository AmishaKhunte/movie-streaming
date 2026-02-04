package com.example.movie_streaming.service;

import com.example.movie_streaming.entity.Genre;
import com.example.movie_streaming.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {

   @Autowired
    private GenreRepository genreRepository;

    public Genre addGenre(Genre genre){
        return genreRepository.save(genre);
    }

    public List<Genre> getAllGenre(){
        return genreRepository.findAll();
    }

    public  Genre getGenreById(Long id){
      return  genreRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("Genre not found with id: "));
    }


    public Genre updateGenre(Long id, Genre updatedGenre) {
        Genre existingGenre = getGenreById(id);
        existingGenre.setName(updatedGenre.getName());
        return genreRepository.save(existingGenre);
    }


    public void deleteGenre(Long id){
        Genre genre = getGenreById(id);
        genreRepository.delete(genre);
    }
}
