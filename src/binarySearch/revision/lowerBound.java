package binarySearch.revision;

public class lowerBound {
    public static void main(String[] args) {
        int [] arr = {10,30,30,30,40,50,60,70};
        int n = arr.length;
        int target =30;
        int lb = 8;
        int low = 0;
        int high = n-1;

        while(low<=high){
         int mid = (low + high)/2;
         if(arr[mid]>=target){
             lb = Math.min(lb,mid);
             high = mid-1;
         }
         else {
             low = mid+1;
         }
        }
        System.out.println(lb);

        int lo = 0;
        int hi = n-1;
        int ub = 0;
        while(lo<=hi){
            int mid =(lo+hi)/2;
            if(arr[mid]>target){
                 ub = mid;
                 hi = mid-1;
            }
            else {
                lo = mid+1;
            }
        }
        System.out.println(ub-1);
    }
}
