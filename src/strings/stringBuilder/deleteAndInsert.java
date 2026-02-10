package strings.stringBuilder;

public class deleteAndInsert {
    public static void main(String[] args) {

         // delete in stringBuilder
        StringBuilder sb= new StringBuilder("Manali");
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println(sb);
        sb.delete(2,3);
        System.out.println(sb);

        // insert at StringBuilder

        StringBuilder tb = new StringBuilder("abc");
        System.out.println(tb);
        tb.insert(2,"A");
        System.out.println(tb);
        tb.insert(2,90);
        System.out.println(tb);


    }
}
