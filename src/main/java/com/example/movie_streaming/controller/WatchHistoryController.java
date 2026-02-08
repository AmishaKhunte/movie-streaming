package com.example.movie_streaming.controller;

import com.example.movie_streaming.entity.WatchHistory;
import com.example.movie_streaming.service.WatchHistoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/watch-history")
public class WatchHistoryController {

    private final WatchHistoryService watchHistoryService;

    public WatchHistoryController(WatchHistoryService watchHistoryService) {
        this.watchHistoryService = watchHistoryService;
    }

    @PostMapping
    public WatchHistory addWatchHistory(
            @RequestParam Long userId,
            @RequestParam Long movieId
    ) {
        return watchHistoryService.addWatchHistory(userId, movieId);
    }

    @GetMapping("/user/{userId}")
    public List<WatchHistory> getWatchHistoryByUser(@PathVariable Long userId) {
        return watchHistoryService.getWatchHistoryByUser(userId);
    }
}

