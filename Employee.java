public class Employee {
    String name;
    int age;
    int id;
    Salary salary;
    Address address;
    
    public Employee(String name, int age, int id, Salary salary, Address address){
        this.name = name;
        this.age = age;
        this.id = id;
        this.salary = salary;
        this.address = address;
    }
}