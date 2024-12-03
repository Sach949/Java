public class Player extends Person{
    String playFromCountry;
    int noOfMatchPlayed;
    
    public void playerDetails(){
        System.out.println("Play from the coutry of: "+playFromCountry);
        System.out.println("Total match played: "+noOfMatchPlayed);   
    }
}