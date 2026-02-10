package array.Practice;

public class secondLargestOnePass {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        int smx=Integer.MIN_VALUE ;
        for (int i = 0; i < n; i++) {
            if (arr[i] > mx) {
                smx = mx;      // old max becomes second max
                mx = arr[i];   // update max
            } else if (arr[i] > smx && arr[i] != mx) {
                smx = arr[i];
            }
        }
        for (int ele :arr){
            System.out.print(ele +" ");
        }
        System.out.println();
        System.out.println(mx  +" ");
        System.out.println(smx  +" ");
    }
}
