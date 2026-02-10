package array;

public class rotateArray {

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int n = arr.length;
        int k = 2; // rotate by 2

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // for  k > n
        k = k % n;

        // step 1
        reverse(arr, 0, n-k - 1);

        // step 2
        reverse(arr, n-k, n - 1);

        // step 3
        reverse(arr, 0, n - 1);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
