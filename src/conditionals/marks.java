package conditionals;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the marks : ");
        int marks= sc.nextInt();

        if(marks>=81) System.out.print("Very good");
        else if(marks>=60 ) System.out.print("Good");

        else if(marks>=40) System.out.print("Average");
        else System.out.print("Fail");


    }
}
