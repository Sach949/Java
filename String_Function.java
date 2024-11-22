public class String_Function{
    public static void main(String[] args){
        String name = "  Rohit Sharma ";

        String profession = "CRICKET PLAYER";

        String result = "passed";

        int output = name.length();
        System.out.println("Length is: "+output);

        char ch = profession.charAt(9);
        System.out.println("Character at 9th place is: "+ch);

        String str = name.concat(profession);
        System.out.println("Concated string is: "+str);

        boolean bool = name.equals(result);
        System.out.println("Is name equal to result: "+bool);

        int ind = result.indexOf('e');
        System.out.println("e is at the index of: "+ind);

        boolean empty = profession.isEmpty();
        System.out.println("I profession empty: "+empty);

        boolean start = name.startsWith("Sharma");
        System.out.println("Is name start with: "+start);

        String lower = profession.toLowerCase();
        System.out.println("Profession is"+profession);
        System.out.println("Lowercase of profession is: "+lower);

        String upper = result.toUpperCase();
        System.out.println("Result is: "+result);
        System.out.println("Uppercase of result is: "+upper);

        String rep = name.replace('R', 'M');
        System.out.println("New name is: "+rep);

        String subStr = result.substring(2, 4);
        System.out.println("Sub String is: "+subStr);

        String trimm = name.trim();
        System.out.println("Trimmed name is: "+trimm);

        int itr = result.hashCode();
        System.out.println("Hash value of result is: "+itr);   


    }
}