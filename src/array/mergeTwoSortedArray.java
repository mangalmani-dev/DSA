package array;

public class mergeTwoSortedArray {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int m = arr1.length;

        int[] arr2 = {5, 6, 7, 8};
        int n = arr2.length;

        int[] arr3 = new int[m + n];

        int i = m-1, j = n-1, k = m+n-1;

//        // merge both arrays
//        while (i < m && j < n) {
//            if (arr1[i] <= arr2[j]) {
//                arr3[k++] = arr1[i++];
//            } else {
//                arr3[k++] = arr2[j++];
//            }
//        }
//
//        // remaining elements of arr1
//        while (i < m) {
//            arr3[k++] = arr1[i++];
//        }
//
//        // remaining elements of arr2
//        while (j < n) {
//            arr3[k++] = arr2[j++];
//        }
//
//        // print merged array
//        for (int ele : arr3) {
//            System.out.print(ele + " ");
//        }

        // method 2

         while (i>=0 && j >=0){
             if(arr1[i]>arr2[j]){
                 arr3[k]=arr1[i];
                 i--;
             }
             else {
                 arr3[k]=arr2[j];
                 j--;
             }
             k--;
         }

         while (i>=0){
             arr3[k]=arr1[i];
             k--;
             i--;
         }
         while (j>=0){
             arr3[k]=arr2[j];
             j--;
             k--;
         }


        for (int ele : arr3) {
        System.out.print(ele + " ");
        }
    }
}
