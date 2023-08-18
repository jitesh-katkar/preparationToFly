package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Movie;
import com.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@GetMapping("hi")
	public String sayHid() {
		return "Hi";
	}
	
	@GetMapping("/movies")
	public List<Movie> getAllMovies(){
		return movieService.getAllMovies();
	}
	
	@GetMapping("/movie/{movieTitle}")
	public List<Movie> findMovieByName(@PathVariable String movieTitle){
		return movieService.getMovieByName(movieTitle);
	}
	
	@PostMapping("/movie")
	public Movie saveMovie(@RequestBody Movie movie){
		return movieService.saveMove(movie);
	}
	
	@PutMapping("/update/movie")
	public Integer updateMovie(@RequestBody Movie movie){
		return movieService.updateMovie(movie);
	}
}
