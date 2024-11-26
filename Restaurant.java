public class Restaurant {

    String resName;
    int noOfEmp;
    FoodType food;
    Cuisine_Varieties variety;
    Online_Delivery_Partner online;

    public Restaurant(String resName, int noOfEmp, FoodType food, Cuisine_Varieties variety,
            Online_Delivery_Partner online) {
        this.resName = resName;
        this.noOfEmp = noOfEmp;
        this.food = food;
        this.variety = variety;
        this.online = online;
    }

    public static void cookFood() {

    }

    public static void serveFood() {

    }

}