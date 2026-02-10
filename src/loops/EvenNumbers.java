package loops;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n :");
        for (int i = 1; i <100 ; i+=2) {
            if(i%2==0)continue;
            System.out.println(i);
        }
    }
}
