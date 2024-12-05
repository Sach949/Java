public class CEO {
    String name;
    int id;
    int noOfManagerUnder;
    Salary salary;
    Address address;

    public CEO(String name, int id, Salary salary, Address address, int noOfManager){
        this.name = name;
        this.id = id;
        this.noOfManagerUnder = noOfManager;
        this.salary = salary;
        this.address = address;
    }
}