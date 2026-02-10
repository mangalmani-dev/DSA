package strings.stringBuilder;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the value of string :");
//        StringBuilder sb= new StringBuilder(sc.nextLine());
//        System.out.println(sb);

        // or
        String s=sc.nextLine();
        StringBuilder sb= new StringBuilder(s);
        System.out.println(sb);


    }
}
