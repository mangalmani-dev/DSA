package TwoDimensionArray;

public class largestElement {
    public static void main(String[] args) {
        int [][] arr= {{1,2},{90,3},{4,50}};

        int mx= Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                mx= Math.max(mx,arr[i][j]);
            }
        }
        System.out.println(mx);
    }
}
