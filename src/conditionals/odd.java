package conditionals;

import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();

        if(n%2==0){
            System.out.println("Number is even :" +n);
        }
        else {
            System.out.println("Number is odd :"+n);
        }

    }
}
