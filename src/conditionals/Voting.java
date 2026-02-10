package conditionals;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age :");
        int age=sc.nextInt();

        System.out.println(((age)>=18 ? "Can be vote" :"Not vote"));
    }
}
