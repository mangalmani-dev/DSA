package basics;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the characters : ");
        char ch= sc.next().charAt(0);
        System.out.println("Asciii value "+ (int)ch);
    }
}
