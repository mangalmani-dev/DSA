package TwoDimensionArray;

public class forEach {
    public static void main(String[] args) {

        int [][] arr = {{1,2,3},{4,5,6}};

        for (int [] ele:arr){
            for (int a:ele){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
