package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer movie_id;
	private String title;
	private Integer year;
	private Integer runtime;
	private Double rating;

	public Movie() {
		
	}
	public Movie(Integer movie_id, String title, Integer year, Integer runtime, Double rating) {
		super();
		this.movie_id = movie_id;
		this.title = title;
		this.year = year;
		this.runtime = runtime;
		this.rating = rating;
	}

	public Integer getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(Integer movie_id) {
		this.movie_id = movie_id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getRuntime() {
		return runtime;
	}
	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}

	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}

}
