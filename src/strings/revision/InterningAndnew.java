package strings.revision;

public class InterningAndnew {
    public static void main(String[] args) {
        String st = "Mangalmani";
        System.out.println(st);
        st = "Sushant";
        String a = new String("Mangalmani");
        System.out.println(a);
    }
}
