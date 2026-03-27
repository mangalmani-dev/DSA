package prefixsum;

public class prefixSum {

    public static void print(int [] arr){
        for (int ele: arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};
        print(arr);

        for (int i = 1; i < arr.length; i++) {
            arr[i]+=arr[i-1];
        }
        System.out.println();
        print(arr);

    }
}
