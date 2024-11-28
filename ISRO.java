public class ISRO {
    int noOfScientists;
    String chairmanName;
    static String ministryName;
    static String firstSatellite;
    static String firstManMission;
    
    public ISRO(String chairmanName, int noOfScientists){
        this.chairmanName = chairmanName;
        this.noOfScientists = noOfScientists;
    }
    
    static{
        ministryName = "Dept of Space";
        firstSatellite = "Aryabhatta";
        firstManMission = "Gaganyaan";
    }
    
    public void printDetails(){
    System.out.println("Chairman name is: "+chairmanName);
    System.out.println("Total Scientists are: "+noOfScientists);
    System.out.println("ISRO comes under: "+ministryName);
    System.out.println("First Satellite launnched by: "+firstSatellite);
    System.out.println("First Man Mission is :"+firstManMission);
    
    }
}