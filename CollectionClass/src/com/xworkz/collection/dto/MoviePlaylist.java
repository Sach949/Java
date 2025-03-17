package com.xworkz.collection.dto;

import java.util.Objects;

public class MoviePlaylist {

	private String movieTitle;
	private String genre;
	private String director;
	
	
	public MoviePlaylist(String movieTitle, String genre, String director) {
		super();
		this.movieTitle = movieTitle;
		this.genre = genre;
		this.director = director;
	}
	
	
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	
	@Override
	public String toString() {
		return "MoviePlaylist [movieTitle=" + movieTitle + ", genre=" + genre + ", director=" + director + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(director, genre, movieTitle);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MoviePlaylist other = (MoviePlaylist) obj;
		return Objects.equals(director, other.director) && Objects.equals(genre, other.genre)
				&& Objects.equals(movieTitle, other.movieTitle);
	}
	
	
}
