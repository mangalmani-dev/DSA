package loops;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number the table you want :");
        int n= sc.nextInt();

        // good  code   it is taking 10 round
      for (int i = 1; i <=10 ; i++) {
            System.out.println(n*i);
        }
         /// baker code it is taking 190 round
        for (int i = 19; i <=190 ; i++) {
            if(i%19==0) {
                System.out.println(i);
            }

        }
        // best code  only 10 round
        for (int i = 19; i <=190 ; i+=19) {
            System.out.println(i);
        }
   }

}
