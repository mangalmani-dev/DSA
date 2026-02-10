package strings;

public class modifyString {
    public static void main(String[] args) {
        String s= "hello";
          // we can do like this
        s= s.substring(0,2) +"y"+ s.substring(3);
        System.out.println(s);
    }
}
