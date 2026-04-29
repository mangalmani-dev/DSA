package array.rev;

public class largestElement {
    static int max =Integer.MIN_VALUE;
    static int smax = Integer.MIN_VALUE;

    // largest element
    public static int largest(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }

 // second largest
    public static int secondLargest(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                smax= max;
                max= arr[i];
            }
            else if(arr[i]>smax && arr[i]!=max){
                smax= arr[i];
            }
        }
        if(smax==Integer.MIN_VALUE)return -1;

        return smax;
    }

    // check sorted or not
    public static boolean sorted(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int []arr = {1,2,8,3,4,5,6,7};
        int n = arr.length;
        // find largest sum
        largest(arr);
        System.out.println(max);

        // find second largest
        secondLargest(arr);
        System.out.println(smax);

        // check the given array is sorted or not

        System.out.println(sorted(arr));


    }
}
