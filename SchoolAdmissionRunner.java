public class SchoolAdmissionRunner {
    public static void main(String[] args) {
        
        SchoolAdmission admin1 = new SchoolAdmission();
        SchoolAdmission admin2 = new SchoolAdmission();
        SchoolAdmission admin3 = new SchoolAdmission();
        SchoolAdmission admin4 = new SchoolAdmission();
        SchoolAdmission admin5 = new SchoolAdmission();
       
//        SchoolAdmission admission2 = new SchoolAdmission("Amit", 12, "Male", "7th Grade", "K-2, Versova", "1235551234",
//                                                          "Karan", "7896545678", "DPS school", "15-12-2024", 
//                                                          "Engineer", "amit@gmail.com", "10-10-2024", 
//                                                          "KV school", "English", "Pending", 
//                                                          "None", true, "Cricket", "None");

        admin1.setStudentName("Alice Smith");
        admin1.setAge(10);
        admin1.setGrade("5th Grade");


        System.out.println("Student Name: " + admin1.getStudentName());
        System.out.println("Age: " + admin1.getAge());
        System.out.println("Grade: " + admin1.getGrade());
    }
}