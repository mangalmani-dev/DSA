package array;

import java.util.Scanner;

public class outputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr= new int[7];
        // taking input from the value
        System.out.println("Enter the value of the given array");
        for (int i = 0; i <=6; i++) {
          arr[i]= sc.nextInt();
        }
        System.out.println("The output for the given loops");
        for (int i = 0; i <=6; i++) {
            System.out.print(arr[i]+" ");
        }



    }
}
