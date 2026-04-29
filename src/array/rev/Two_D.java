package array.rev;

import java.util.Scanner;

public class Two_D {
    public static void print(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static int largest(int [][]arr){
         int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                max= Math.max(max,arr[i][j]);
            }
        }
        return max;
    }
    public static void main(String[] args) {
      int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

    }
    }

