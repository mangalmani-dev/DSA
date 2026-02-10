package recurrsion;

import java.util.Scanner;

public class mazePath {
//    public static int maize(int row, int cols , int m , int n){
//        if(row ==m ||cols==n) return 1;
//
//        int rightways = maize(row,cols+1, m, n);
//        int downtways = maize(row+1,cols, m, n);
//        return rightways +downtways;
//    }

    public static int maize2(int m,int n){
        if(m==1 || n==1)return 1;
         int leftWay= maize2(m,n-1);
         int upWay= maize2(m-1,n);
         return leftWay+upWay;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows & coloums :");
        int m= sc.nextInt();
        int n= sc.nextInt();
        System.out.println(maize2(m,n));
    }
}
