package sorting.revision;

public class insertion2d {
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
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j; k >=1 ; k--) {
                    if(arr[i][k]<arr[i][k-1]){
                        int temp = arr[i][k-1];
                        arr[i][k-1] = arr[i][k];
                        arr[i][k]= temp;
                    }
                }
            }
        }
        System.out.println();
        print(arr);
    }
}
