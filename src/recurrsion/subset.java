package recurrsion;

import java.util.ArrayList;

public class subset {
    static ArrayList<String> arr = new ArrayList<>();
    public static void printsubset(int i , String s , String ans){
     if(i==s.length()){
      arr.add(ans);
         return;
     }
       char ch = s.charAt(i);
        printsubset(i+1,s,ans);
       printsubset(i+1,s,ans+ch);

    }
    public static void main(String[] args) {
        String s= "abcd";
        arr= new ArrayList<>();  // rest
        printsubset(0,s,"");
        System.out.println(arr);
    }
}
