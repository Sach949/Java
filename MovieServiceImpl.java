public class MovieServiceImpl extends MovieService{

	@Override
	public String validateAndSave(MoviesDto dto) {
		
		if(dto != null) {
			if(dto.getMovieCode() >0) {
				System.out.println("validate and save movieCode");
			}else {
				System.err.println("Invalid movie code");
			}
			
			if(dto.getTitle() !=null && dto.getTitle().length() >1) {
				System.out.println("validate and save movie title");
			}else {
				System.err.println("Title is null or less than 1 char");
			}
			
			if(dto.getGenre() !=null && dto.getGenre().length() >3) {
				System.out.println("validate and save movie genre");
			}else {
				System.err.println("Genre is null or less than 3 char");
			}
			
			if(dto.getDirector() !=null && dto.getDirector().length() >3) {
				System.out.println("validate and save movie director");
			}else {
				System.err.println("Director name is null or less than 3 char");
			}
			
			int year = getYearCount(dto.getReleaseYear()); 
			if(year == 4) {
				System.out.println("validate and save release year");
			}else {
				System.err.println("Invalid year entry or year is greater than 2027");
			}
			
			
			if(dto.getRatings() <=10 && dto.getRatings() >=0) {
				System.out.println("validate and save ratings");
			}else {
				System.err.println("Invalid ratings or greater than 10 or less than 0");
			}
			
			if(dto.getDurationInMinutes() > 10) {
				System.out.println("validate and save duration");
			}else {
				System.err.println("Duration should be greater than 10 minutes");
			}
			
			if(dto.getLanguage() !=null && dto.getLanguage().length() >3) {
				System.out.println("validate and save language");
			}else {
				System.err.println("Language name is null or less than 3 char");
			}
			
			if(dto.getCountry() !=null && dto.getCountry().length() >3) {
				System.out.println("validate and save country");
			}else {
				System.err.println("Country name is null or less than 3 char");
			}
			
			if(dto.getLeadActor() !=null && dto.getLeadActor().length() >3) {
				System.out.println("validate and save Lead Actor");
			}else {
				System.err.println("Lead Actor name is null or less than 3 char");
			}
			
			if(dto.getLeadActress() !=null && dto.getLeadActress().length() >3) {
				System.out.println("validate and save Lead Actress");
			}else {
				System.err.println("Lead Actress name is null or less than 3 char");
			}
			
			if(dto.isAvailableIn3D() == true) {
				System.out.println("Available in 3D");
			}else {
				System.err.println("Not available in 3D");
			}
			
			if(dto.getProductionCompany() !=null && dto.getProductionCompany().length() >3) {
				System.out.println("validate and save Production Company");
			}else {
				System.err.println("Production Company name is null or less than 3 char");
			}
			
			if(dto.getBoxOfficeCollectionInCrores() > 0) {
				System.out.println("validate and save collection");
			}else {
				System.err.println("Collection is 0");
			}
			
			if(dto.isSequel() == true) {
				System.out.println("It is sequel");
			}else {
				System.err.println("Not sequel");
			}

		}else {
			System.err.println("Dto is null");
		}
		
		
		return "not saved";
	}

	//Year calc
			public static int getYearCount(int year) {
				int count =0;
				while(year != 0) {
					year /=4;
					count++;
				}
				return count;
			}
	
}
