package strings;

import java.util.Scanner;

public class countVowels {
    public  static boolean isVowel(char ch){
        if(ch=='A'|ch=='a') return  true;
        if(ch=='E'|ch=='e') return true;
        if(ch=='I'|ch=='i') return true;
        if(ch=='O'|ch=='o') return  true;
        if(ch=='U'|ch=='u') return  true;
        return  false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        int n = s.length();
        int count=0;
        for (int i = 0; i < n; i++) {
              char ch= s.charAt(i);
           if(isVowel(ch)==true)count++;
        }
        System.out.println(count);
        }
}
