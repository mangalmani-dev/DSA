package prefixsum;

public class sumbetweenTwoIndex {

    public static void print(int [] arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
    public static  int val(int[] arr ,int left ,int right){
        if(left == 0){
            return arr[right];
        }
           // last value - current - 1 value
       return arr[right]- arr[left-1];

    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        int left = 0;
        int right = 1;
        print(arr);
        for (int i = 1; i < arr.length; i++) {
            arr[i]= arr[i]+arr[i-1];
        }
        System.out.println();
        System.out.println(val(arr,left,right));

    }
}
