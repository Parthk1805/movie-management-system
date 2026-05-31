package com.jsp.MovieProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movie {
	@Id
          private int id;
          private String movieName;
          private String hero;
          private double rating;
		  public Movie() {
			super();
			// TODO Auto-generated constructor stub
		  }
		  public Movie(int id, String movieName, String hero, double rating) {
			super();
			this.id = id;
			this.movieName = movieName;
			this.hero = hero;
			this.rating = rating;
		  }
		  @Override
		  public String toString() {
			return "Movie [id=" + id + ", movieName=" + movieName + ", hero=" + hero + ", rating=" + rating + "]";
		  }
		  public int getId() {
			  return id;
		  }
		  public void setId(int id) {
			  this.id = id;
		  }
		  public String getMovieName() {
			  return movieName;
		  }
		  public void setMovieName(String movieName) {
			  this.movieName = movieName;
		  }
		  public String getHero() {
			  return hero;
		  }
		  public void setHero(String hero) {
			  this.hero = hero;
		  }
		  public double getRating() {
			  return rating;
		  }
		  public void setRating(double rating) {
			  this.rating = rating;
		  }
          
}
