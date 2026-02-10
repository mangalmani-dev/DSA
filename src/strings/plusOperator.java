package strings;

public class plusOperator {
    public static void main(String[] args) {

        // with the help of plus operator we can
        String s= "abc";
        s= s+"def";
        System.out.println(s);

        // interest things

        System.out.println("abc"+20+30);   // ans =>  abc2030
        System.out.println(10+20+"abc");   // ans => 30abc
    }
}
