package conditionals;

import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the a : ");
        int a = sc.nextInt();
        System.out.print("Enter the b : ");
        int b = sc.nextInt();
        System.out.print("Enter the c : ");
        int c =sc.nextInt();
          if(a>b && b>c){
              System.out.println("a is greater :" + a);
          } else if (a<b && b>c) {
              System.out.println("b is greater :"+ b);
          }
          else {
              System.out.println("C is greater :"+ c);
          }

    }
}
