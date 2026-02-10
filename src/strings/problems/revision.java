package strings.problems;

import java.util.Scanner;

public class revision {
    public static void main(String[] args) {
    String str= "sushant";
    String sc= "";
        for (int i = 0; i < str.length(); i++) {
            if(i%2==0){
                sc+='a';
            }
            else{
               sc+=str.charAt(i);
            }
        }
        str=sc;
        System.out.println(str);
    }
}
