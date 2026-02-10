package strings;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        String s= "mangalmani";
        char [] ch = s.toCharArray();
        for (char ele :ch){
            System.out.print(ele);
        }
        System.out.println();

        Arrays.sort(ch);
        for (char ele :ch){
            System.out.print(ele);
        }
        System.out.println();


    }
}
