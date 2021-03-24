package com.example.movie.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.movie.model.Movie;

public interface MovieRepository extends MongoRepository<Movie, Integer>{
	
	

}
