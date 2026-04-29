package strings.revision;

public class changeEvenPosition {
    public static void main(String[] args) {
        String st = "Ritik";
        int n = st.length();
        String s = "";

        for (int i = 0; i < n; i++) {
            if(i%2==0){
                s+="a";
            }
            else {
              s= s + st.charAt(i);
            }
        }
        System.out.println(s);
    }
}
