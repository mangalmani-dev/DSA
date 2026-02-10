package TwoDimensionArray;

public class minimumElement {
    public static void main(String[] args) {
        int [][] arr= {{1,2},{90,3},{4,50}};

        int mn= Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                mn= Math.min(mn,arr[i][j]);
            }
        }
        System.out.println(mn);
    }
}
