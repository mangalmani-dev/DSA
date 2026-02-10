package strings;

import java.util.Scanner;

public class convertIntoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int a= sc.nextInt();
        String s= a +"";
        System.out.println(s);
    }
}
