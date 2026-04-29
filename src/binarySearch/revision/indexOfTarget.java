package binarySearch.revision;

public class indexOfTarget {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int target =9;
        int low = 0;
        int high = n-1;
        System.out.println(arr[0] +" " + arr[n-1]);

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                System.out.println("The target value and idex is :"+ arr[mid]+": "+mid);
                break;
            }
            else if(arr[mid]<target){
             low = mid+1;
            }
            else {
              high = mid-1;
            }
        }
    }
}
