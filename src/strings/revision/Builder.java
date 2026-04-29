package strings.revision;

public class Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        for (int i = 0; i <sb.capacity() ; i++) {
             sb= new StringBuilder("mangalmani");
        }
        System.out.println(sb);
        System.out.println(sb.reverse());


    }
}
