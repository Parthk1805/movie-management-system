package com.jsp.MovieProject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.MovieProject.entity.Movie;

public interface movieRepo  extends JpaRepository<Movie, Integer>{
    List<Movie> findByMovieNameContainingIgnoreCase(String movieName);
}
