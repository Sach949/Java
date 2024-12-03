public class Inheritance {
    public static void main(String[] args) {
        
        System.out.println("\n-------Single Inheritance------\n");
        Vulture vul = new Vulture();
        vul.name = "Vulture";
        vul.breed = "Indian Vulture";
        vul.placesFound = "India";
        vul.printDetails();
        
        vul.noOfBird = 2000;
        vul.typesOfVulture = 9;
        vul.vultureDetails();
        vul.canEat();
        vul.canFly();
        
        System.out.println("\n-------Multilevel Inheritance------\n");
        System.out.println("\n-----Person/Player/Cricketer----\n");
        
        Cricketer cricket = new Cricketer();
        cricket.name = "Kunal";
        cricket.age = 30;
        cricket.playFromCountry = "India";
        cricket.noOfMatchPlayed = 7;
        cricket.personDetails();
        cricket.playerDetails();
      
        cricket.playMusic();
        cricket.driveCar();
        
        
        System.out.println("\n-------Heirarchy Inheritance - Employees------\n");
        System.out.println("\n-----Manager----\n");
        Manager man = new Manager();
        man.name = "Ram";
        man.id = 202400;
        man.noOfEmpWorkingUnder = 50;
        man.project = "S/W Development";
        man.employeeDetails();
        man.managerDetails();
        
        System.out.println("\n-----Director----\n");
        Director dir = new Director();
        dir.name ="Shyam";
        dir.id = 2023100;
        dir.totalNoOfManager = 20;
        dir.totalProjects = 20;
        dir.employeeDetails();
        dir.directorDetails();
        
    }
}