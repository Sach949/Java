public class Company {
    String compName;
    String hq;
    int noOfEmployees;
    CEO ceo;
    Manager manager;
    Employee emp;

    public Company(String compName, String hq, int noOfEmployees,
            CEO ceo, Manager manager,Employee emp){
        this.compName = compName;
        this.hq = hq;
        this.noOfEmployees = noOfEmployees;
        this.ceo = ceo;
        this.manager = manager;
        this.emp = emp;
    }
    
    public void printDetails(){
        System.out.println("Name of the company: " +compName);
        System.out.println("HQ of the company: "+hq);
        System.out.println("Total employees are: "+noOfEmployees);
        
        System.out.println("\n-----CEO Details------");
        
        System.out.println("CEO name : "+ceo.name);
        System.out.println("ID of CEO is: "+ceo.id);
        System.out.println("No. of manager working under CEO: "+ceo.noOfManagerUnder);
        System.out.println("Basic salary of CEO: "+ceo.salary.basicPay);
        System.out.println("HRA for CEO: "+ceo.salary.hra);
        System.out.println("Net salary of CEO: "+ceo.salary.totalSalary);
        System.out.println("Addres is: "+ceo.address.area);
        System.out.println("Pincode is: "+ceo.address.pincode);
        System.out.println("State is: "+ceo.address.state);
        
        System.out.println("\n-----Manager Details------");
        
        System.out.println("Manager name : "+manager.name);
        System.out.println("ID of Manager is: "+manager.id);
        System.out.println("No. of Employee working under Manager: "+manager.noOfEmpUnder);
        System.out.println("Basic salary of Manager: "+manager.salary.basicPay);
        System.out.println("HRA for Manager: "+manager.salary.hra);
        System.out.println("Net salary of Manager: "+manager.salary.totalSalary);
        System.out.println("Addres is: "+manager.address.area);
        System.out.println("Pincode is: "+manager.address.pincode);
        System.out.println("State is: "+manager.address.state);
        
        System.out.println("\n-----Employee Details------");
        
        System.out.println("Employee name : "+emp.name);
        System.out.println("Age of Employee is: "+emp.age);
        System.out.println("ID of Employee is: "+emp.id);
        System.out.println("Basic salary of Employee: "+emp.salary.basicPay);
        System.out.println("HRA for Employee: "+emp.salary.hra);
        System.out.println("Net salary of Employee: "+emp.salary.totalSalary);
        System.out.println("Addres is: "+emp.address.area);
        System.out.println("Pincode is: "+emp.address.pincode);
        System.out.println("State is: "+emp.address.state);
    }
    
}