public class Bird {

    String name;
    String breed;
    String placesFound;
    
    
    public void canFly(){
        System.out.println("Bird can fly");
    }
    
    public void canEat(){
        System.out.println("It can eat");
    }
    
    public void printDetails(){
        System.out.println("Name of the bird is: "+name);
        System.out.println("Name of the breed : "+breed);
        System.out.println("Places where it is found: "+placesFound);
    }
    
}