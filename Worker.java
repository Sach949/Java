public class Worker{
    public static void main(String []args){
        numberOfWork(3,5);

        int d = printedCopyGiven(4,5);
        System.out.println("Given is: "+d);

        String x= officeComingWorker("Rahul");
        String y= officeComingWorker("Ajit");
        System.out.println(x+ " and " +y);

        double cl = cleaner(20.99, 10.99);
        System.out.println("Total cleaners are: "+cl);

        long l = workingTime(2000000L,1000000L);
        System.out.println("Time is: "+l);

        boolean bool = isWorkDone(true);
        System.out.println("Work done?: "+bool);

        float val = value(10.5f,11.5f);
        System.out.println("Value is: "+val);

        char ch = letter('S');
        System.out.println("Letter is: "+ch);

        byte bt = 90;
        lengthOfOffice(bt);
        System.out.println("Length in meter is: "+bt);

        short sh = 12345;
        widthOfOffice(sh);
        System.out.println("Width in feet is: "+sh);

    }

    public static void numberOfWork(int a, int b){
        int totalWork = a+b;
        System.out.println("Total work is: "+totalWork);
    }

    public static int printedCopyGiven(int a, int b){
        int c = a+b;
        return c;
    }

    public static String officeComingWorker(String a){
        return a;
        //return "ankur and anmol";
    }

    public static double cleaner(double a, double b){
        double c = a-b;
        return c;
    }

    public static long workingTime(long a, long b){
        long l = a-b;
        return l;
    }

    public static boolean isWorkDone(boolean a){
        return a;
    }

    public static float value(float a, float b){
        float c = a*b;
        return c;
    }

    public static char letter(char a){
        return a;
    }

    public static byte lengthOfOffice(byte a){
        return a;
    }

    public static short widthOfOffice(short a){
        return a;
    }


}