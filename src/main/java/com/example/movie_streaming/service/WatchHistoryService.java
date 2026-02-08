package com.example.movie_streaming.service;

import com.example.movie_streaming.entity.Movie;
import com.example.movie_streaming.entity.User;
import com.example.movie_streaming.entity.WatchHistory;
import com.example.movie_streaming.repository.MovieRepository;
import com.example.movie_streaming.repository.UserRepository;
import com.example.movie_streaming.repository.WatchHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WatchHistoryService {

    private final WatchHistoryRepository watchHistoryRepository;
    private final UserRepository userRepository;
    private final MovieRepository movieRepository;

    public WatchHistoryService(
            WatchHistoryRepository watchHistoryRepository,
            UserRepository userRepository,
            MovieRepository movieRepository
    ) {
        this.watchHistoryRepository = watchHistoryRepository;
        this.userRepository = userRepository;
        this.movieRepository = movieRepository;
    }

    public WatchHistory addWatchHistory(Long userId, Long movieId) {

        User user = userRepository.findById(userId).orElse(null);
        Movie movie = movieRepository.findById(movieId).orElse(null);

        if (user == null || movie == null) {
            return null;
        }

        WatchHistory history = new WatchHistory();
        history.setUser(user);   // ✅ correct
        history.setMovie(movie); // ✅ correct

        return watchHistoryRepository.save(history);
    }

    public List<WatchHistory> getWatchHistoryByUser(Long userId) {

        User user = userRepository.findById(userId).orElse(null);

        if (user == null) {
            return List.of();   // empty list if user not found
        }

        return watchHistoryRepository.findByUser(user);
    }

}
