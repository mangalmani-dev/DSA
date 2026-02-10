package strings;

public class equals {
    public static void main(String[] args) {

        // sahi approch
        String s= "abcd";
        String t= "abcd";
        System.out.println(s.equals(t));


   // Wrong approch
        String a= "xyzabc";
        String b= "xyz";
        b=b+"abc";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a==b);
    }
}
