package com.example.movie_streaming.service;

import com.example.movie_streaming.entity.Genre;
import com.example.movie_streaming.entity.Movie;
import com.example.movie_streaming.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.movie_streaming.repository.GenreRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private GenreRepository genreRepository;


    public Movie addMovie(Movie movie) {

        if (movie.getGenre() == null || movie.getGenre().getId() == null) {
            throw new RuntimeException("Genre id must be provided");
        }

        Genre genre = genreRepository.findById(movie.getGenre().getId())
                .orElseThrow(() -> new RuntimeException("Genre not found"));

        movie.setGenre(genre);
        return movieRepository.save(movie);
    }
    public Movie updateMovie(Long id, Movie updatedMovie) {

        Movie existingMovie = movieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Movie not found with id: " + id));

        if (updatedMovie.getGenre() == null || updatedMovie.getGenre().getId() == null) {
            throw new RuntimeException("Genre id must be provided");
        }

        Genre genre = genreRepository.findById(updatedMovie.getGenre().getId())
                .orElseThrow(() -> new RuntimeException("Genre not found"));

        existingMovie.setTitle(updatedMovie.getTitle());
        existingMovie.setReleaseYear(updatedMovie.getReleaseYear());
        existingMovie.setRating(updatedMovie.getRating());
        existingMovie.setGenre(genre);

        return movieRepository.save(existingMovie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieByID(long id) {
        Optional<Movie> movie = movieRepository.findById(id);
        return movie.orElse(null);
    }

    public void deleteMovieById(Long id) {
        movieRepository.deleteById(id);
    }

}







