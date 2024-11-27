public class Company_Chaining {

    String empName;
    int empID;
    String compName;
    int noOfEmp;
    String city;
    int pincode;

    public Company_Chaining(){
        System.out.println("Default Constructor");
    }

    public Company_Chaining(String empName){
        this.empName = empName;
    }

    public Company_Chaining(String empName, int empId){
        this(String empName);
        //this.empName = empName;
        this.empID = empId;
    }
    
    public Company_Chaining(String empName, int empId, String compName){
        this(empName, empId);
        // this.empName = empName;
        // this.empID = empId;
        this.compName = compName;
    }
    
    public Company_Chaining(String empName, int empId, String compName, int noOfEmp, String city){
        this(empName,empId,compName);
        // this.empName = empName;
        // this.empID = empId;
        // this.compName = compName;
        this.noOfEmp = noOfEmp;
    }

    public Company_Chaining(String empName, int empId, String compName, int noOfEmp, String city){
        this(empName,empId,compName,noOfEmp);
        // this.empName = empName;
        // this.empID = empId;
        // this.compName = compName;
        // this.noOfEmp = noOfEmp;
        this.city = city;
    }

    
    public Company_Chaining(String empName, int empId, String compName, int noOfEmp, String city,int pincode){
        this(empName,empId,compName,noOfEmp,city);
        // this.empName = empName;
        // this.empID = empId;
        // this.compName = compName;
        // this.noOfEmp = noOfEmp;
        // this.city = city;
        this.pincode = pincode;
    }
    

//    public void details(){
//         System.out.println("Employee name: "+empName);
//         System.out.println("Employee name: "+empId);
//         System.out.println("Employee name: "+compName);
//         System.out.println("Employee name: "+empnoOfEmpName);
//         System.out.println("Employee name: "+city);
//         System.out.println("Employee name: "+pincode);
//    }

}