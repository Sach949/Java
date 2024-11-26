public class Township {
    String townName;
    int noOfBuildings;
    BuildingType build;
    Floor floor;
    Room_No room;

    public Township(String townName, int noOfbuildings, BuildingType build,
            Floor floor, Room_No room) {
        
        this.townName = townName;
        this.noOfBuildings = noOfbuildings;
        this.build = build;
        this.floor = floor;
        this.room = room;
    }
    
    public static void provideHouse(){
        
    }
    
    public static void providePlayground(){
        
    }
    
}