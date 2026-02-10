package array;

public class Sort0and1TwoPointer {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {0,0,0,1,1,1};
        int n = arr.length;

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            } else {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        System.out.println();
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
