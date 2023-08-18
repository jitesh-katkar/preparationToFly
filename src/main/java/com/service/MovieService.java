package com.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Movie;
import com.repository.MovieRepository;

//import jakarta.transaction.Transactional;
import org.springframework.transaction.annotation.Transactional;
@Service
public class MovieService {  
	
	@Autowired
	private MovieRepository movieRepository;
	
	public List<Movie> getAllMovies(){
		return movieRepository.findAll();
	}

	public List<Movie> getMovieByName(String title) {
		return movieRepository.findAll().stream().filter(mv -> mv.getTitle().equals(title)).collect(Collectors.toList());
	}

	@Transactional
	public Movie saveMove(Movie movie) {
		return movieRepository.saveAndFlush(movie);
	}
	@Transactional
	public Integer updateMovie(Movie movie) {
		/*
		 * Movie m = new Movie(); m.setMovie_id(movie.getMovie_id()); m.setTitle("RRR");
		 * m.setRuntime(180); m.setRating(8.2); m.setYear(2022);
		 */
		return movieRepository.updateMovie(movie.getMovie_id(), movie.getTitle());
	}

}
