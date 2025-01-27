public class MovieRunner {

	public static void main(String[] args) {
		System.out.println("Main method");
		
		MoviesDto moviesDto = new MoviesDto();
		moviesDto.setMovieCode(1);
		moviesDto.setTitle("RRR");
		moviesDto.setGenre("Action");
		moviesDto.setDirector("Rajamoulli");
		moviesDto.setReleaseYear(2022);
		moviesDto.setRatings(8.2);
		moviesDto.setDurationInMinutes(319);
		moviesDto.setLanguage("Hindi, Telugu");
		moviesDto.setCountry("India");
		moviesDto.setLeadActor(null);
		moviesDto.setLeadActress(null);
		moviesDto.setAvailableIn3D(true);
		moviesDto.setProductionCompany("Rajamouli production");
		moviesDto.setBoxOfficeCollectionInCrores(700);
		moviesDto.setSequel(false);

		System.out.println("Movie Details are: "+moviesDto);
		
		MovieService movieService = new MovieServiceImpl();
		movieService.validateAndSave(moviesDto);
	}
}