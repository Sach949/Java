public class Ministers extends GovernmentInherit{
    String ministryName;
    String nativeConstituency;
    String partyName;

    public Ministers(String name, int age, int noOfTimesElected, int netWorth, 
            String ministryName, String nativeConstituency, String partyName) {
        super(name, age, noOfTimesElected, netWorth);
        this.ministryName = ministryName;
        this.nativeConstituency = nativeConstituency;
        this.partyName = partyName;
    }
    public void ministerDetails(){
        System.out.println("\n-----Ministers details------\n");
        System.out.println("Name of the Ministers: "+name);
        System.out.println("Age of Ministers: "+age);
        System.out.println("No. of time elected: "+noOfTimesElected);
        System.out.println("Net Worth of Ministers: "+netWorth);
        System.out.println("Portfolio he is holding: "+ministryName);
        System.out.println("His native constituency: "+nativeConstituency);
        System.out.println("His party name: "+partyName);
    }
}