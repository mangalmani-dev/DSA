package loops;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("The even numbers are :");

        for (int i = 1; i <=10 ; i++) {
              if(i%2==0){
                  System.out.println(i);
              }
        }
    }
}
