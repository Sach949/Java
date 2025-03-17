package com.xworkz.assignrinterface.runner;

import com.xworkz.assignrinterface.interfaces.Movie;

public class MovieRunner {

	public static void main(String[] args) {
		System.out.println("Main Method");
		
		Movie movie = new Movie();
		movie.namingTitle();
		movie.announcingMovieName();
		movie.decidingTheStyle();
		movie.directingMovie();
		movie.takingAudition();
		movie.selectingCast();
		movie.decidingGenre();
		movie.publishingGenre();
		movie.decidingDuration();
		movie.fixingDuration();
		movie.gettingRatings();
		movie.gettingPublicity();
		movie.fixingReleaseDate();
		movie.announcingReleaseDate();
		movie.providingMoney();
		movie.gettingProfit();
		movie.spokenLanguage();
		movie.dubbingLanguage();
		movie.haveName();
		movie.HaveOrigingCountry();
		movie.profession();
	}
}