package TwoDimensionArray;

public class rotateby90 {
    public  static void print (int[][] arr){
        int m = arr.length;
        int n= arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        int n= arr[0].length;
        print(arr);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp= arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println();
        print(arr);

        // rotate each reverse loop

        for (int i = 0; i < n; i++) {
            int a=0,b=m-1;
              while (a<b){
                  int temp= arr[i][a];
                  arr[i][a]=arr[i][b];
                  arr[i][b]=temp;
                  a++;
                  b--;
              }
        }
        System.out.println();
        print(arr);
        

    }
}
