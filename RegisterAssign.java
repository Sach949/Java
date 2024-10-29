public class RegisterAssign {

    public static void main(String[] args) {
        phoneNo(00000000);
        phoneNo(33333333);
        
        address("Benglore");
        address("Mumbai");
        
        seconds(1000000L);
        seconds(2000000L);
        
        height(20.99);
        height(10.97);
        
        answer(true);
        answer(false);
        
        value(10.5f);
        value(11.6f);
        
//        length(80);
//        length(10);
//        
//        width(12345);
//        width(20000);
        
        alphabet('S', 'N');
    }
    
    public static void phoneNo(int a){
        System.out.println("Phone no. is: " +a);
    }
    
    public static void address(String a) {
        System.out.println("Address is: "+a);
    }
    
    public static void seconds(long a) {
        System.out.println("Seconds is: "+a);
    }
    
    public static void height(double a) {
        System.out.println("Height is: "+a);
    }
    
    public static void answer(boolean a) {
        System.out.println("Is it true or false: "+a);
    }
    
    public static void value(float a) {
        System.out.println("Value is: "+a);
    }
    
    public static void length(byte b) {
        System.out.println("length is: "+b);
    }
    
    public static void width(short s) {
        System.out.println("width is: "+s);
    }
    public static void alphabet(char c, char d) {
        System.out.println("First letter is: "+c);
        System.out.println("Last letter is: "+d);
    }
    
}