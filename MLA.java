public class MLA extends GovernmentInherit{
    String electedFromConstituency;
    String socialActivities;
    int noOfawards;

    public MLA(String name, int age, int noOfTimesElected, int netWorth, 
            String electedFromConstituency, String socialActivities, int noOfawards) {
        super(name, age, noOfTimesElected, netWorth);
        this.electedFromConstituency = electedFromConstituency;
        this.socialActivities = socialActivities;
        this.noOfawards = noOfawards;
    }
    
    public void mlaDetails(){
        System.out.println("\n-----MLAs details------\n");
        System.out.println("Name of the MLAs: "+name);
        System.out.println("Age of MLA: "+age);
        System.out.println("No. of times elected: "+noOfTimesElected);
        System.out.println("Net Worth of MLA: "+netWorth);
        System.out.println("Elected from constituency: "+electedFromConstituency);
        System.out.println("His social activities: "+socialActivities);
        System.out.println("Awards: "+noOfawards);
    }
}