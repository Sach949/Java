public class CompanyRunner {

    public static void main(String[] args) {
        
        System.out.println("\n------Company 1------\n");
        Salary salary = new Salary(200000, 50000, 250000);
        Address address = new Address("Ashok Colony", 560023, "Karnataka");
        CEO ceo = new CEO("Vishal", 10001, salary, address, 20);

        salary = new Salary(100000, 30000, 130000);
        address = new Address("Rajanna Colony", 820001, "Maharashtra");
        Manager manage = new Manager("Nithin", 20001, 30, salary, address);

        salary = new Salary(40000, 10000, 50000);
        address = new Address("Shiva Colony", 221001, "Delhi");
        Employee emp = new Employee("Gomtesh", 25, 30001, salary, address);

        Company comp = new Company("Google", "USA", 210000, ceo, manage, emp);
        comp.printDetails();
        
        System.out.println("\n------Company 2------\n");
        
        salary = new Salary(300000, 50000, 350000);
        address = new Address("Laxmi Colony", 110011, "TamilNadu");
        ceo = new CEO("Vinod", 20002, salary, address, 30);

        salary = new Salary(1500000, 30000, 180000);
        address = new Address("Laxman Colony", 300012, "MP");
        manage = new Manager("Utkarsh", 30003, 40, salary, address);

        salary = new Salary(50000, 10000, 60000);
        address = new Address("Preet Vihar", 276589, "Rajasthan");
        emp = new Employee("Niroshan", 20, 40004, salary, address);

        comp = new Company("Wipro", "India", 100000, ceo, manage, emp);
        comp.printDetails();

    }
}