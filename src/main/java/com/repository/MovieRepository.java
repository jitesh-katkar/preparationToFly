package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
	//@Query("SELECT u FROM User u WHERE u.status = ?1 and u.name = ?2")
	
	@Query("select m from Movie m where m.title = :title")
	public List<Movie> findByTitle(String title);
	
	
	  @Modifying(clearAutomatically = true)
	  @Query("update Movie m set m.title =:title where m.movie_id =:movie_id") 
	  public Integer updateMovie(@Param("movie_id") Integer movie_id, @Param("title")String title); 
	 

}
