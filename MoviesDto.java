public class MoviesDto {

	private int movieCode;
	private String title;
	private String genre;
	private String director;
	private int releaseYear;
	private double ratings;
	private int durationInMinutes;
	private String language;
	private String country;
	private String leadActor;
	private String leadActress;
	private boolean isAvailableIn3D;
	private String productionCompany;
	private long boxOfficeCollectionInCrores;
	private boolean isSequel;
	
	public MoviesDto() {
		
	}

	public MoviesDto(int movieCode, String title, String genre, String director, int releaseYear, double ratings,
			int durationInMinutes, String language, String country, String leadActor, String leadActress,
			boolean isAvailableIn3D, String productionCompany, long boxOfficeCollectionInCrores, boolean isSequel) {
		super();
		this.movieCode = movieCode;
		this.title = title;
		this.genre = genre;
		this.director = director;
		this.releaseYear = releaseYear;
		this.ratings = ratings;
		this.durationInMinutes = durationInMinutes;
		this.language = language;
		this.country = country;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.isAvailableIn3D = isAvailableIn3D;
		this.productionCompany = productionCompany;
		this.boxOfficeCollectionInCrores = boxOfficeCollectionInCrores;
		this.isSequel = isSequel;
	}

	public int getMovieCode() {
		return movieCode;
	}

	public void setMovieCode(int movieCode) {
		this.movieCode = movieCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	public int getDurationInMinutes() {
		return durationInMinutes;
	}

	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	public String getLeadActress() {
		return leadActress;
	}

	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}

	public boolean isAvailableIn3D() {
		return isAvailableIn3D;
	}

	public void setAvailableIn3D(boolean isAvailableIn3D) {
		this.isAvailableIn3D = isAvailableIn3D;
	}

	public String getProductionCompany() {
		return productionCompany;
	}

	public void setProductionCompany(String productionCompany) {
		this.productionCompany = productionCompany;
	}

	public long getBoxOfficeCollectionInCrores() {
		return boxOfficeCollectionInCrores;
	}

	public void setBoxOfficeCollectionInCrores(long boxOfficeCollectionInCrores) {
		this.boxOfficeCollectionInCrores = boxOfficeCollectionInCrores;
	}

	public boolean isSequel() {
		return isSequel;
	}

	public void setSequel(boolean isSequel) {
		this.isSequel = isSequel;
	}

	@Override
	public String toString() {
		return "MoviesDto [movieCode=" + movieCode + ", title=" + title + ", genre=" + genre + ", director=" + director
				+ ", releaseYear=" + releaseYear + ", ratings=" + ratings + ", durationInMinutes=" + durationInMinutes
				+ ", language=" + language + ", country=" + country + ", leadActor=" + leadActor + ", leadActress="
				+ leadActress + ", isAvailableIn3D=" + isAvailableIn3D + ", productionCompany=" + productionCompany
				+ ", boxOfficeCollectionInCrores=" + boxOfficeCollectionInCrores + ", isSequel=" + isSequel + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (boxOfficeCollectionInCrores ^ (boxOfficeCollectionInCrores >>> 32));
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((director == null) ? 0 : director.hashCode());
		result = prime * result + durationInMinutes;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + (isAvailableIn3D ? 1231 : 1237);
		result = prime * result + (isSequel ? 1231 : 1237);
		result = prime * result + ((language == null) ? 0 : language.hashCode());
		result = prime * result + ((leadActor == null) ? 0 : leadActor.hashCode());
		result = prime * result + ((leadActress == null) ? 0 : leadActress.hashCode());
		result = prime * result + movieCode;
		result = prime * result + ((productionCompany == null) ? 0 : productionCompany.hashCode());
		long temp;
		temp = Double.doubleToLongBits(ratings);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + releaseYear;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MoviesDto other = (MoviesDto) obj;
		if (boxOfficeCollectionInCrores != other.boxOfficeCollectionInCrores)
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (durationInMinutes != other.durationInMinutes)
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (isAvailableIn3D != other.isAvailableIn3D)
			return false;
		if (isSequel != other.isSequel)
			return false;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		if (leadActor == null) {
			if (other.leadActor != null)
				return false;
		} else if (!leadActor.equals(other.leadActor))
			return false;
		if (leadActress == null) {
			if (other.leadActress != null)
				return false;
		} else if (!leadActress.equals(other.leadActress))
			return false;
		if (movieCode != other.movieCode)
			return false;
		if (productionCompany == null) {
			if (other.productionCompany != null)
				return false;
		} else if (!productionCompany.equals(other.productionCompany))
			return false;
		if (Double.doubleToLongBits(ratings) != Double.doubleToLongBits(other.ratings))
			return false;
		if (releaseYear != other.releaseYear)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
}
