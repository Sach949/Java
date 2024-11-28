public class Mudumalai_Forest {
    int area;
    boolean isDense;
    static String state;
    static String partOf;
    static String districtName;
    
    public  Mudumalai_Forest(int area, boolean isDense){
        this.area = area;
        this.isDense = isDense;
    }
    
    static{
        state = "TamilNadu";
        partOf = "Nilgiri Forest";
        districtName = "Nilgiri";
    }
    
    public void printDetails(){
        System.out.println("Total area in kmsquare is: "+area);
        System.out.println("Is it dense forest: "+isDense);
        System.out.println("It is in state of: "+state);
        System.out.println("It is part of: "+partOf);
        System.out.println("It is in district of:"+districtName);
    
    }
}