package recurrsion;

import java.util.Scanner;

public class stairPath {
    public static int path(int n){
       if(n==2||n==1)return n;
       return path(n-1)+path(n-2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int n = sc.nextInt();
        System.out.println( path(n));
    }
}
