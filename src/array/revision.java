package array;

import java.util.Scanner;

public class revision {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
        }
            if(flag==true){
                System.out.println("The element found ");
            }
            else {
                System.out.println("The element is not found  ");
            }
        }

}
