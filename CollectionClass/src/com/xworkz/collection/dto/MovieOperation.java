package com.xworkz.collection.dto;

import java.util.ArrayList;
import java.util.List;

public class MovieOperation {

	private List<MoviePlaylist> playlist = new ArrayList<MoviePlaylist>();
	
	//add method
	public void addMovie(MoviePlaylist movie) {
		if(playlist !=null) {
			playlist.add(movie);
			System.out.println("Successfully added the movie titled: "+movie);
		}else {
			System.out.println("Movie is null");
		}
	}
	
	//Remove method
	public boolean removeMovie(String title) {
		if(title !=null) {
			for(MoviePlaylist movie: playlist) {
				if(movie.getMovieTitle() != null && movie.getMovieTitle() == title) {
					playlist.remove(movie);
					System.out.println("Removed the movie titled: "+movie);
					return true;
				}else {
					System.out.println("Movie does not exist");
				}
			}
		}else{
			System.out.println("Title is null");
		}
		return false;
	}
	
	
	//update method
	public boolean updatePlaylist(String title,String newGenre, String newDir) {
		if(playlist!=null) {
			for(MoviePlaylist movie: playlist) {
				if(movie.getMovieTitle() != null && movie.getMovieTitle().equals(title)) {
					System.out.println("Movie Title is found");
					movie.setDirector(newDir);
					movie.setGenre(newGenre);
					System.out.println("Playlist updated");
					return true;
				}else {
					System.out.println("Movie does not exist");
				}
			}
		}
		
		return false;
		
	}

	
	//search method
	public void searchMovies(String movie) {
		if(playlist!=null) {
			for(MoviePlaylist list: playlist) {
				if(list.getMovieTitle() != null && list.getMovieTitle() == movie) {
					System.out.println("Movie is found: "+list);
					
				}else {
					System.out.println("No match is found in Playlist");
				}
			}
		}else {
			System.out.println("Playlist is null");
		}
		
		
	}
	
	
	//View method
		public void viewPlaylist() {
			if(playlist.isEmpty()) {
				System.out.println("Playlist is empty");
			}else {
				for(MoviePlaylist movies : playlist) {
					System.out.println("Playlist movie is: "+movies);
				}
			}
		}
		
		
		//count genre method
		public void countMovies(String genre) {
			int countGenre =0;
			for(MoviePlaylist movie: playlist) {
				if(movie.getGenre() ==genre) {
					countGenre++;
				}
			}
			System.out.println("Total movies are: "+countGenre);
			
		}

}
