public class KaveriRiver {
    String volumeOfWater;
    int streamSpeed;
    static String originPoint;
    static String fallsInto;
    static String flowsThrough;
    
    public KaveriRiver(String volume, int speed){
        this.volumeOfWater = volume;
        this.streamSpeed = speed;
    }
    
    static{
        originPoint = "Tala Kaveri";
        fallsInto = "Bay Of Bengal";
        flowsThrough = "Karnataka & TamilNadu";
    }
    
    public void printDetails(){
    System.out.println("Volume of Water is: "+volumeOfWater);
    System.out.println("Flow speed in Km/h is: "+streamSpeed);
    System.out.println("Origin point of kaveri: "+originPoint);
    System.out.println("It falls into: "+fallsInto);
    System.out.println("Flow into state of:"+flowsThrough);
    }
    
}