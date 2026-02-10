package array.Practice;

import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) {
        int [] arr = {10,20,60,10};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i]==arr[j]){
                    System.out.println("The duplicte element are :" + arr[i]);
                }
            }
        }

    }
}
