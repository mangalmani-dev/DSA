package array.Practice;

public class product {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        int prod=1;
        for (int i = 0; i <n ; i++) {
             prod = prod*arr[i];
        }
        System.out.println(prod);
    }
}
