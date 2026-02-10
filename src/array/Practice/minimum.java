package array.Practice;

public class minimum {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60};
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min,arr[i]);
        }
        for (int ele :arr){
            System.out.print(ele +" ");
        }
        System.out.println();
        System.out.println(min);
    }
}
