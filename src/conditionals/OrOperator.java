package conditionals;

import java.util.Scanner;

public class OrOperator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n =sc.nextInt();
        if(n%3==0 || n%5==0){
            System.out.print("the given numbers is divisible by 3 or 5");
        }
        else {
            System.out.print("the given numbers is not divisible by 3 or 5");
        }

    }
}
