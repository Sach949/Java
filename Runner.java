public class Runner {
    public static void main(String [] args){
        
        //For company
        Company comp;
        Company comp1;
        Company comp2;
        
        System.out.println("-----Company-----\n");
        comp = new Company("Sachin", 2024100, Company_Name.MICROSOFT, Working_Area.SOFTWARE_DEVELOPER, City.BENGALORE);
        System.out.println(comp);
        
        comp1 = new Company("Arjun", 2023200, Company_Name.AMAZON, Working_Area.HR, City.PUNE);
        System.out.println(comp1);
        
        comp2 = new Company("Ankur", 2022300, Company_Name.MERCEDES, Working_Area.MARKETING, City.HYDERABAD);
        System.out.println(comp2);
        
        
        //For Restaurant
        Restaurant res;
        Restaurant res1;
        Restaurant res2;
        
        System.out.println("\n-----Restaurant-----\n");
        res = new Restaurant("Meghana Foods", 50, FoodType.VEG_AND_NON_VEG, Cuisine_Varieties.BIRYANI, 
                Online_Delivery_Partner.ZOMATO);
        System.out.println(res);
        
        res1 = new Restaurant("Ayodhya2Udupi", 20, FoodType.VEG, Cuisine_Varieties.PANEER_MASALA, 
                Online_Delivery_Partner.SWIGGY);
        System.out.println(res1);
        
        res2 = new Restaurant("New Tandoor", 80, FoodType.NON_VEG, Cuisine_Varieties.FISH_CURRY,
                Online_Delivery_Partner.FOODPANDA);
        System.out.println(res2);
        
        
        //For Township
        Township town;
        Township town1;
        Township town2;
        System.out.println("\n-----Township-----\n");
        town = new Township("Police Colony", 10, BuildingType.TWO_BHK, Floor.SIX_FL, Room_No.A11);
        System.out.println(town);
        
        town1 = new Township("Army Colony", 25, BuildingType.THREE_BHK, Floor.FOUR_FL, Room_No.C31);
        System.out.println(town1);
        
        town2 = new Township("Varsova Apartment", 5, BuildingType.FOUR_BHK, Floor.SIX_FL, Room_No.D41);
        System.out.println(town2);
        
    }
}
