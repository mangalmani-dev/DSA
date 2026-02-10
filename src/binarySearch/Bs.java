package binarySearch;

public class Bs {
    public static void main(String[] args) {
        int [] arr = {34,54,23,45,67,87,90};
        int target=4;
        int n = arr.length;
        boolean flag =false;
        int low = 0;
        int high = n-1;
        while (low<high){
           int mid = (low+high)/2;
           if(arr[mid]==target){
               flag=true;
               break;
           } else if (arr[mid]>target) {
               high=mid-1;
           }
           else {
               low=mid+1;
           }
        }
        if(flag){
            System.out.println("Elemnt found");
        }
        else {
            System.out.println("Element not found");
        }
    }
}
