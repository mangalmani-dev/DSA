package array;

import java.util.Arrays;

public class copyArray {
    public static void main(String[] args) {
        int [] arr= {10,23,34,23,53,34};
          // shallow copy
        for (int ele :arr){
            System.out.print(ele+" ");
        }
        int [] nums=arr;
        System.out.println();
        nums[0]=70;
        System.out.println(arr[0]);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        // deep copy
        System.out.println();
        int [] brr= Arrays.copyOf(arr,arr.length);
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] +" ");
        }
        System.out.println();
        brr[0]=90;
        System.out.println(arr[0]);
        System.out.println(brr[0]);

        // more way to create a deep copy
        int [] crr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            crr[i]=arr[i];
        }
        System.out.println(crr[0]);

    }
}
