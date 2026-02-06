package com.example.movie_streaming.repository;

import com.example.movie_streaming.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

    boolean existsByEmail(String email);


    Optional<User> findByEmail(String email);
}
