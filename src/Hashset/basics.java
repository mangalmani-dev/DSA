package Hashset;

import java.util.HashSet;

public class basics {
    public static int reverse(int n){
        int rev =0;
        while (n!=0){
           rev = rev*10 + n%10;
            n/=10;
        }
        return rev;

    }
    public static void main(String[] args) {
      int [] arr = {1,13,10,12,13};
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
            set.add(reverse(arr[i]));
        }

        System.out.println(set.size());

    }
}
