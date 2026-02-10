package array.Practice;

import java.security.spec.RSAOtherPrimeInfo;

public class palindrome {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,3,2,1};
        int n = arr.length;

        int i = 0;
        int j =n-1;
        boolean isPallindrome = true;

        while (i <= j) {
              if(arr[i]!=arr[j]){
                  isPallindrome= false;
                  break;
            }
              i++;
              j--;
        }
        if (isPallindrome==true){
            System.out.println("the given array is pallidrome");
        }
        else {
            System.out.println("The given array is not pallindome");
        }
    }
}
