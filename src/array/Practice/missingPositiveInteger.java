package array.Practice;

import java.util.Scanner;

public class missingPositiveInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of integer :");
        int n = sc.nextInt();
         int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                min = Math.min(min, arr[i]);
            }
        }
        for (int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();
        System.out.println(min);
    }
}
