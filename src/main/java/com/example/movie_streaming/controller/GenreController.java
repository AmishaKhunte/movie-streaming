package com.example.movie_streaming.controller;


import com.example.movie_streaming.entity.Genre;
import com.example.movie_streaming.service.GenreService;
import jakarta.validation.Path;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/genres")
public class GenreController {

    @Autowired
    private GenreService genreService;

    @PostMapping
    public Genre addGenre(@Valid @RequestBody Genre genre) {
        return genreService.addGenre(genre);
    }

    @GetMapping
    public List<Genre> getAllGenres() {
        return genreService.getAllGenre();
    }

    @DeleteMapping({"/id"})
    public String deleteGenre(@PathVariable Long id){
        genreService.deleteGenre(id);
        return "Genre Delete successfull";
    }



    @PutMapping("/{id}")
    public Genre updateGenre(
            @PathVariable Long id,
            @Valid @RequestBody Genre genre) {
        return genreService.updateGenre(id, genre);
    }



}

