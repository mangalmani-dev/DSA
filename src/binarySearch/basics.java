package binarySearch;

public class basics {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int target = 10;
        boolean flag = false;

        while (low <=high){
             int mid= (low+high)/2;
             if(arr[mid]==target) {
                 flag = true;
                 break;
             }
             else if(arr[mid]<target){
                 low=mid+1;
            }
             else {
                 high= mid-1;
             }
        }
         if(flag){
             System.out.println("Element  found");
         }
         else {
             System.out.println("Element not found");
         }

    }
    }

