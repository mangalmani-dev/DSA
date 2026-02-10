package TwoDimensionArray;

public class Transpose {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m= arr.length;
        int n = arr[0].length;

        // row wise print
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println("Transpose of matrix");
          // cols wise print
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        // storing in new matrix
        System.out.println();

        System.out.println("Tranpose of matrix using new matrix ");

        int [][] transpose= new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               transpose[i][j]= arr[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
}
