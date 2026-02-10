package array;

public class initialiseArray {
    public static void main(String[] args) {
        int [] arr = {10,11,12,13,14,15,34,2,234,234,2453,234};
        int n =arr.length;
        System.out.println(n);
        for (int i = 0; i <=n-1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
