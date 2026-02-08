package com.example.movie_streaming.repository;

import com.example.movie_streaming.entity.WatchHistory;
import com.example.movie_streaming.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WatchHistoryRepository extends JpaRepository<WatchHistory, Long> {


    List<WatchHistory> findByUser(User user);
}
