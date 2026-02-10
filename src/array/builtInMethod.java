package array;

import java.util.Arrays;

public class builtInMethod {
    public static void main(String[] args) {
        int [] arr= {10,23,34,23,53,34};

        // for each loops
       for (int ele :arr){
           System.out.print(ele+" ");
       }
        Arrays.sort(arr);
        System.out.println();
          for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
