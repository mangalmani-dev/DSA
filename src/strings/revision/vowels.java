package strings.revision;

public class vowels {
    public static boolean isvowels(char ch){
        if(ch=='a'|| ch=='A')return true;
        if(ch=='e'|| ch=='E')return true;
        if(ch=='i'|| ch=='I')return true;
        if(ch=='o'|| ch=='O')return true;
        if(ch=='u'|| ch=='U')return true;
        return false;
    }
    public static void main(String[] args) {
         String st = "myth";
         int n = st.length();
         int count =0;
        for (int i = 0; i < n; i++) {
            char ch = st.charAt(i);
            if(isvowels(ch)==true)count++;
        }
        System.out.println(count);
    }
}
