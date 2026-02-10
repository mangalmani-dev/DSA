package binarySearch;

public class Occurance {
    public static void main(String[] args) {
        int [] arr = {10,20,30,30,30,40,50,60,70};
        int n = arr.length;
        int target= 30;
        int lb= 8;
        int lo= 0;
        int hi= n-1;
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>=target){
                lb= Math.min(lb,mid);
                hi= mid-1;
            }
            else {
                lo= mid+1;
            }
        }
        System.out.println("Lower bound "+lb);
           lo= 0;
         hi =n-1;
         int ub = 9;
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>target){
                ub= Math.min(ub,mid);
                hi= mid-1;
            }
            else {
                lo= mid+1;
            }
        }
        System.out.println("Upper bound "+ (ub-1));
    }
}
