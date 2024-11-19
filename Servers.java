public class Servers{
    String serverName;
    int noOfHDD;
    String processorsName;
    int noOfComponents;

    Servers(){
        System.out.println("Default constructor is created");
    }

    Servers(int noOfServers){
        System.out.println("No of servers are: "+noOfServers);
    }

    Servers(String name){
        System.out.println("Server name is: "+name);
    }

    Servers(String name, int quantity){
        System.out.println("Name and Quantity are: "+ name+" "+quantity);
    }

    Servers(int quantity, String name){
        System.out.println("Quantity and name are: "+quantity+" "+name);
    }

    public static void provideStorage(){
        
    }

    public static void storesData(){

    }

    public static void accessData(){
        
    }
}