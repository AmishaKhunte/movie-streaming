package com.example.movie_streaming.repository;

import com.example.movie_streaming.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

    User findByEmail(String email);
}
