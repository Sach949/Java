public class Manager {
    String name;
    int id;
    int noOfEmpUnder;
    Salary salary;
    Address address;
    
    public Manager(String name, int id, int noOfEmp, Salary salary, Address address){
        this.name = name;
        this.id = id;
        this.noOfEmpUnder = noOfEmp;
        this.salary = salary;
        this.address = address;
    }
}