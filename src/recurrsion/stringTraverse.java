package recurrsion;

public class stringTraverse {
public static void print(int i, String st){
    if(i==st.length())return;
    System.out.print(st.charAt(i));
    print(i+1,st);
}
    public static void main(String[] args) {
        String st= "mangalmani";
        print(0,st);
    }
}
