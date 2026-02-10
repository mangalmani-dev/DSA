package TwoDimensionArray;

import java.util.Scanner;

public class outputUsingNestedLoops {
    public static void main(String[] args) {

        int [][] grid = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input");

        int m= grid.length;    // no of rows
        int n = grid[0].length;  // no of cols

        // input of 2d array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
             grid[i][j]= sc.nextInt();
            }
        }

        // output of 2d array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }

    }
}
