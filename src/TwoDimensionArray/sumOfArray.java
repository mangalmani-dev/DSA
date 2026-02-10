package TwoDimensionArray;

public class sumOfArray {
    public static void main(String[] args) {
        int [][] arr= {{1,2},{3,4},{5,6},{7,8}};

        int sum=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                sum=sum+arr[i][j];
            }
        }
        System.out.println("sum of arr :" + sum);
    }
}
