public class OverloadingAssign{
    public static void main(String []args){
         schoolGoingStudents(10);
         schoolGoingStudents("Sachin"); //for string datatypes
         schoolGoingStudents(11,"Shyam"); // for int and string
         schoolGoingStudents("Deep", 12); //for string and int
         schoolGoingStudentsByName("Aman");
         schoolGoingStudentsById(121);
         schoolGoingStudentsByNameAndId("Shubham", 109);
         schoolGoingStudentsByIdAndName(230,"Vishal");
    }

    public static void schoolGoingStudentsByName(String name){
        System.out.println("Names of the students who are going to school: "+name);
    }

    public static void schoolGoingStudentsById(int id){
        System.out.println("ID of the students who are going to school: "+id);
    }
    
    public static void schoolGoingStudentsByNameAndId(String name, int id){
        System.out.println("Name and ID of the students who are going to school: "+name+" "+id);
    }
    
    public static void schoolGoingStudentsByIdAndName(int id, String name){
        System.out.println("ID and Name of the students who are going to school: "+id+" "+name);
    }

    public static void schoolGoingStudents(int id){
        System.out.println("ID of the students who are going to school: "+id);
    }

    public static void schoolGoingStudents(String name){
        System.out.println("Name of the students who are going to school: "+name);
    }

    public static void schoolGoingStudents(int id, String name){
        System.out.println("ID and Name of the students who are going to school: "+id+" " +name);
    }

    public static void schoolGoingStudents(String name, int id){
        System.out.println("Name and ID of the students who are going to school: "+name +" "+ id);
    }
}
