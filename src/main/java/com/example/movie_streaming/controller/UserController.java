package com.example.movie_streaming.controller;

import com.example.movie_streaming.entity.User;
import com.example.movie_streaming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);

    }

    @GetMapping("/email/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.findByEmail(email);


    }

    // TEST API (OPTIONAL BUT RECOMMENDED)
    @GetMapping("/test")
    public String test() {
        return "User API working!";
    }
}