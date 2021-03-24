/**
 * 
 */
package com.example.movie.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie.model.Movie;
import com.example.movie.repository.MovieRepository;

/**
 * @author abdare
 *
 */


@RestController
public class MovieController {

	@Autowired
	private MovieRepository repository;
	
	@PostMapping("/saveMovie")
	public String addMovie(@RequestBody Movie movie) {
		
		repository.save(movie);
		
		return "Movie added successfully";
		
	}
	
	@GetMapping("/getMovie/{id}")
	public Optional<Movie> getMovieName(@PathVariable int id) {
		return repository.findById(id);
		
	}
	
	@GetMapping("/getAllMovies")
	public List<Movie> getHi() {
		return repository.findAll();
	}
	
}
