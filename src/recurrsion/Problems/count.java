package recurrsion.Problems;

import java.util.Scanner;

public class count {
    public static int count(int n , int ans){
        if(n==1)return 1;

        return count(n-1,ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        System.out.println(count(n,0));
    }
}
