package com.example.movie_streaming.service;

import com.example.movie_streaming.entity.Rating;
import com.example.movie_streaming.repository.MovieRepository;
import com.example.movie_streaming.repository.RatingRepository;
import com.example.movie_streaming.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class RatingService {

    private final RatingRepository ratingRepository;

    // constructor injection (industry standard)
    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public Rating addRating(Rating rating) {
        return ratingRepository.save(rating);
    }

}
