public class UnitedNations {
    int employees;
    int noOfConventions;
    static String hq;
    static int yearOfEstablishment;
    static String initiatedBy;
    
    public UnitedNations(int emp, int conventions){
        this.employees = emp;
        this.noOfConventions  = conventions;
    }
    
    static{
        hq = "NewYork";
        yearOfEstablishment = 1945;
        initiatedBy = "USA";
    }
    
    public void printDetails(){
    System.out.println("Total Employees are: "+employees);
    System.out.println("Total no. Conventions are: "+noOfConventions);
    System.out.println("HQ of UN: "+hq);
    System.out.println("Established in the year: "+yearOfEstablishment);
    System.out.println("I was initiative of: "+initiatedBy);
    
    }
}