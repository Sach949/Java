public class ChiefMinister extends GovernmentInherit {
    String placeElected;
    int noOfLawsPassed;
    String education;

    public ChiefMinister(String name, int age, int noOfTimesElected, int netWorth,
            String placeElected, int noOfLawsPassed, String education) {
        super(name, age, noOfTimesElected, netWorth);
        this.placeElected = placeElected;
        this.noOfLawsPassed = noOfLawsPassed;
        this.education = education;
    }
    
    public  void CMDetails(){
        System.out.println("\n-----CM details------\n");
        System.out.println("Name of the CM: "+name);
        System.out.println("Age of CM: "+age);
        System.out.println("No. of time elected: "+noOfTimesElected);
        System.out.println("Net Worth in crore of CM: "+netWorth);
        System.out.println("Place from where he is elected: "+placeElected);
        System.out.println("No. of laws paased during his tenure: "+noOfLawsPassed);
        System.out.println("Education of CM: "+education);
    }
    
}