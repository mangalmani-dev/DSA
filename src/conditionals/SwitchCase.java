package conditionals;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the value is a : ");
        int a =sc.nextInt();
        System.out.print("Enter the operator : ");
        int op = sc.next().charAt(0);
        System.out.print("Enter the value of b : ");
        int b= sc.nextInt();

        switch(op){
            case '+':
                System.out.print(a+b);
                break;
            case '-':
                System.out.print(a-b);
                break;
            case '*' :
                System.out.print(a*b);
                break;
            case '/' :
                System.out.print(a/b);
        }


    }
}
