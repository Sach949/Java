public class Strings{
    public static void main(String[] args) {
        //using literals
        String firstName = "Aman";
        String lastName = "Kumar";
        String cityName = "Bengaluru";
        String book = "The Jungle Book";
        String sport = "Cricket";
        String season = "Winter";
        String schoolName = "Kendriya Vidyalaya";
        String countryName = "India";
        String movie = "KGF";
        String jobTitle = "Software Developer";

        
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("City: " + cityName);
        System.out.println("Book: " + book);
        System.out.println("Sport: " + sport);
        System.out.println("Season: " + season);
        System.out.println("School Name: " + schoolName);
        System.out.println("Country: " + countryName);
        System.out.println("Movie: " + movie);
        System.out.println("Job Title: " + jobTitle);
        
        //Reassigning of Value using literals
        sport = "Football";
        season = "Spring";
        schoolName = "DPS";
        countryName = "USA";
        movie = "RRR";

        System.out.println("Sport: " + sport);
        System.out.println("Season: " + season);
        System.out.println("School Name: " + schoolName);
        System.out.println("Country: " + countryName);
        System.out.println("Movie: " + movie);
        
        // Using new Keyword
        String greeting = new String("Hello, Good Morning");
        String userName = new String("Aman11");
        String emailAddress = new String("aman@gmail.com");
        String phoneNumber = new String("123-456-7890");
        String officeName = new String("Amazon");
        String color = new String("Blue");
        String date = new String("21/11/2024");
        String message = new String("Welcome to Java!");
        String food = new String("Pizza");
        String programmingLanguage = new String("Java");

      
        System.out.println("Greeting: " + greeting);
        System.out.println("User Name: " + userName);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Office Name: " + officeName);
        System.out.println("Favorite Color: " + color);
        System.out.println("Date: " + date);
        System.out.println("Message: " + message);
        System.out.println("Favorite Food: " + food);
        System.out.println("Programming Language: " + programmingLanguage);

        //Reassigning of Value using new keyword
        color = new String("Green");
        date = new String("22/11/2024");
        message = new String("Welcome to Bengaluru");
        food = new String("Burger");
        programmingLanguage = new String("C++");

        System.out.println("Color: " + color);
        System.out.println("Date: " + date);
        System.out.println("Message: " + message);
        System.out.println("Food: " + food);
        System.out.println("Programming Language: " + programmingLanguage);
    }
}






