package array;

import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        int [] arr= {10,20,300,40,50,54303};
        int n = arr.length;
        int max=arr[0];
        for (int i = 1; i < n; i++) {
           if(max<arr[i]){
               max=arr[i];
           }

        }
        System.out.println(max);
    }
}
