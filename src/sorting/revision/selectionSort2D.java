package sorting.revision;

public class selectionSort2D {
    public static void print(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] arr = {{3, 1, 2},{9, 5, 7},{6, 4, 8}};
        int m  = arr.length;
        int n = arr[0].length;
        print(arr);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n-1; j++) {
                int min = Integer.MAX_VALUE;
                int mind = -1;
                for (int k = j; k < n; k++) {
                    if(arr[i][k] < min){
                      min = arr[i][k];
                      mind = k;

                    }
                }
                int temp = arr[i][j];
                arr[i][j] = arr[i][mind];
                arr[i][mind] = temp;
            }
        }
        System.out.println();

        print(arr);





    }
}
