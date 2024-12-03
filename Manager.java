public class Manager extends Employees{
    String project;
    int noOfEmpWorkingUnder;
    
    public void managerDetails(){
        System.out.println("Project is: "+project);
        System.out.println("No. of employees working under him: "+noOfEmpWorkingUnder);
    }
}