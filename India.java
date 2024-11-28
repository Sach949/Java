public class India {
    String pmName;
    int gdp;
    static String countryCode;
    static String continent;
    static String capitalName;
    
    public India(String pmName, int gdp){
        this.pmName = pmName;
        this.gdp = gdp;
    }
    
    static{
        countryCode = "+91";
        continent = "Asia";
        capitalName = "New Delhi";
    }
    
    public void printDetails(){
    System.out.println("PM name is: "+pmName);
    System.out.println("GDP is: "+gdp);
    System.out.println("Country code is: "+countryCode);
    System.out.println("Continent is: "+continent);
    System.out.println("Capital of India is :"+capitalName);
    
    }
    
}