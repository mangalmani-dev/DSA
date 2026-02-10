package strings.stringBuilder;

public class functions {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Mangalmani");
        StringBuilder tb= new StringBuilder("Jangalmani");

        System.out.println(sb.compareTo(tb));
        System.out.println(sb.indexOf("m"));
        System.out.println(sb.reverse());

        sb.setCharAt(2,'Z');
        System.out.println(sb);
    }
}
