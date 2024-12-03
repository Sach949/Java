public class Director extends Employees{
    int totalNoOfManager;
    int totalProjects;
    
    public void directorDetails(){
        System.out.println("Total no. manager working under him: "+totalNoOfManager);
        System.out.println("Total no. of projects under his direction: "+totalProjects);
    }
}