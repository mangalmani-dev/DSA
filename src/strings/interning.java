package strings;

public class interning {
    public static void main(String[] args) {
        String s= "Mangalmani";
//        String t= "Mangalmani";

         // To create a new string
        String t = new String("Mangalmani");
        System.out.println(s);
        System.out.println(t);
    }
}
