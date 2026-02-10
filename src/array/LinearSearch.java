package array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the value of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the value want to search");
        int value = sc.nextInt();

        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                flag = true;
                break;
            }
        }
           if(flag == true) {
               System.out.print("Element found");
           }
           else{
                   System.out.print("Element not found");
               }  }
        }


