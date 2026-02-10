package sorting.quickSort;

import java.util.Scanner;

public class quickSelect {
    static int ans;

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int smallerCount = 0;

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] <= pivot) smallerCount++;
        }

        int correctIdx = low + smallerCount;
        swap(arr, low, correctIdx);

        int i = low, j = high;
        while (i < correctIdx && j > correctIdx) {
            if (arr[i] <= pivot) i++;
            else if (arr[j] > pivot) j--;
            else {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return correctIdx;
    }

    public static void quickselect(int[] arr, int low, int high, int k) {
        if (low > high) return;

        int idx = partition(arr, low, high);

        if (idx == k - 1) {
            ans = arr[idx];
            return;
        } else if (k - 1 < idx) {
            quickselect(arr, low, idx - 1, k);
        } else {
            quickselect(arr, idx + 1, high, k);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 9, 7, 1, 2, 3, 6, 5, 8};

        int n = arr.length;
        System.out.println("Enter the kth smallest element:");
        int k = sc.nextInt();

        print(arr);
        quickselect(arr, 0, n - 1, n-k+1);
        print(arr);

        System.out.println("Answer: " + ans);
    }
}
