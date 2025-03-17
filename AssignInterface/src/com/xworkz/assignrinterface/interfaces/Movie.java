package com.xworkz.assignrinterface.interfaces;

public class Movie implements Title, Director, Cast, Genre, 
Duration, Rating, ReleaseDate, ProductionCompany, IndustryName, Language{

	//Language
	@Override
	public void spokenLanguage() {
		System.out.println("Language is Hindi");
		
	}

	@Override
	public void dubbingLanguage() {
		System.out.println("Dubbed in All Indian Language");
		
	}

	//Production Company
	@Override
	public void providingMoney() {
		System.out.println("Production Company provide Money for movie");
		
	}

	@Override
	public void gettingProfit() {
		System.out.println("Production Company earns profit");
		
	}

	//ReleaseDate
	@Override
	public void fixingReleaseDate() {
		System.out.println("Production house and director fixing the release date");
		
	}

	@Override
	public void announcingReleaseDate() {
		System.out.println("Making release date public");
		
	}

	//Rating
	@Override
	public void gettingRatings() {
		System.out.println("Movie is getting rating by different rating platforms");
		
	}

	@Override
	public void gettingPublicity() {
		System.out.println("In returns getting public response");
		
	}

	//Duration
	@Override
	public void decidingDuration() {
		System.out.println("Production house and director deciding the length of the movie");
		
	}

	@Override
	public void fixingDuration() {
		System.out.println("They decided the duration based on the genre");
		
	}

	@Override
	public void decidingGenre() {
		System.out.println("Deciding the genre");
		
	}

	@Override
	public void publishingGenre() {
		System.out.println("making genre public");
		
	}

	//cast
	@Override
	public void takingAudition() {
		System.out.println("audition is going on for cast");
		
	}

	@Override
	public void selectingCast() {
		System.out.println("Based on audition, selecting the casts");
		
	}

	@Override
	public void directingMovie() {
		System.out.println("Director is directing the movie");
		
	}
	
	@Override
	public void decidingTheStyle() {
		System.out.println("Director will decide the action style");
		
	}

	@Override
	public void namingTitle() {
		System.out.println("Naming of the title based the story");
		
	}

	@Override
	public void announcingMovieName() {
		System.out.println("Making the title public");
		
	}

	//industry
	@Override
	public void haveName() {
		System.out.println("Movie Industry will have Name");
		
	}

	@Override
	public void HaveOrigingCountry() {
		System.out.println("Industry will have origin country");
		
	}

	@Override
	public void profession() {
		System.out.println("Profession");
		
	}
	
}
