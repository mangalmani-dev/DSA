package array;

public class sortZeroOneTwo {
    public static void swap(int[] arr, int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {

        int[] arr = {0,1,2,1,0,2,1,0,1,2,1,0};
        int n = arr.length;

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

//        int noOfZero = 0;
//        int noOfOne = 0;
//        int noOfTwo = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 0) noOfZero++;
//            else if (arr[i] == 1) noOfOne++;
//            else noOfTwo++;
//        }
//
//        System.out.println();
//        System.out.println(noOfZero + " " + noOfOne + " " + noOfTwo);
//
//        // fill 0s
//        for (int i = 0; i < noOfZero; i++) {
//            arr[i] = 0;
//        }
//
//        // fill 1s
//        for (int i = noOfZero; i < noOfZero + noOfOne; i++) {
//            arr[i] = 1;
//        }
//
//        // fill 2s
//        for (int i = noOfZero + noOfOne; i < n; i++) {
//            arr[i] = 2;
//        }

        System.out.println();

        // method 2 dutch flag  algorithm

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else { // arr[mid] == 2
                swap(arr, mid, high);
                high--;
            }
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
