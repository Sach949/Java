package com.xworkz.collection.runner;

import com.xworkz.collection.dto.MovieOperation;
import com.xworkz.collection.dto.MoviePlaylist;

public class MovieRunner {

	public static void main(String[] args) {
		
		MoviePlaylist list = new MoviePlaylist("Dhoom", "Action", "Vishal");
		MoviePlaylist list2 = new MoviePlaylist("Raaz", "Horror", "Ramesh");
		MoviePlaylist list3 = new MoviePlaylist("Avengers","Action", "Tony");
		MoviePlaylist list4 = new MoviePlaylist("RRR", "Action", "Rajamoulli");
		MoviePlaylist list5 = new MoviePlaylist("Jurrasic Park", "Animal-action", "Anand");
		
		System.out.println("-------Adding movie--------\n");
		MovieOperation ops = new MovieOperation();
		ops.addMovie(list);
		ops.addMovie(list2);
		ops.addMovie(list3);
		ops.addMovie(list4);
		ops.addMovie(list5);
		
		System.out.println("\n------Displaying movies------\n");
		ops.viewPlaylist();
		
		System.out.println("\n------Updating movie-------\n");
		ops.updatePlaylist("Avengers", "Scifi", "Chris");
		
		System.out.println("\n------Displaying movies after update------\n");
		ops.viewPlaylist();
		
		System.out.println("\n---------Searching the movie--------\n");
		ops.searchMovies("Avengers");
		ops.searchMovies("Bahubali");
		
		System.out.println("\n--------Counting the movies-------\n");
		ops.countMovies("Action");
		
		
		System.out.println("\n------Removing the movie-------\n");
		ops.removeMovie("Dhoom");
		
		System.out.println("\n------Displaying movies------\n");
		ops.viewPlaylist();
	}
}
