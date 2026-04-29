package binarySearch.revision;

public class search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        int target = 3;
        int low = 0;
        int high = n - 1;
        boolean flag = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                flag = true;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(flag){
            System.out.println("Element found");
        }
        else {
            System.out.println("Element Not found");
        }
    }
}
