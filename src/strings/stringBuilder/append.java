package strings.stringBuilder;

public class append {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("mangalmani");
        sb.append(95);
        System.out.println(sb);
        sb.append("######");
        System.out.println(sb);
        int [] arr= {1,2,3,4,5,6,7};
        sb.append(arr);   // does not work
        System.out.println(sb);
    }
}
