public class Static {

    public static void main(String[] args) {
        
        System.out.println("------India------\n");
        India india = new India("Shri Narendra Modi", 300000000);
        india.printDetails();
        System.out.println(India.countryCode);
        System.out.println(India.continent);
        System.out.println(India.capitalName);
        
        System.out.println("\n------ISRO------\n");
        ISRO isro = new ISRO("Shri Somnath", 600);
        isro.printDetails();
        System.out.println(ISRO.ministryName);
        System.out.println(ISRO.firstSatellite);
        System.out.println(ISRO.firstManMission);
        
        
        System.out.println("\n------Kaveri------\n");
        KaveriRiver kaveri  = new KaveriRiver("4.5 lakh cusecs", 60);
        kaveri.printDetails();
        System.out.println(KaveriRiver.originPoint);
        System.out.println(KaveriRiver.fallsInto);
        System.out.println(KaveriRiver.flowsThrough);
        
        System.out.println("\n------United Nations------\n");
        UnitedNations un = new UnitedNations(10000, 1701);
        un.printDetails();
        System.out.println(UnitedNations.hq);
        System.out.println(UnitedNations.yearOfEstablishment);
        System.out.println(UnitedNations.initiatedBy);
        
        System.out.println("\n------Mudumalai Forest------\n");
        Mudumalai_Forest forest = new Mudumalai_Forest(20000, true);
        forest.printDetails();
        System.out.println(Mudumalai_Forest.partOf);
        System.out.println(Mudumalai_Forest.districtName);
        System.out.println(Mudumalai_Forest.state);
        
    }
    
}