package loops;

import java.util.Scanner;

public class basicsOfLoops {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number you want to print :");
        int n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.println("Hello world"); // body
        }
    }
}
