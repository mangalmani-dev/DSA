package loops;

import java.util.Scanner;

public class Print1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number where you want to print :");
        int n =sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
