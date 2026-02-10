package array;

public class pivotIndex {
    public static void main(String[] args) {

        int[] arr = {1,7,3,6,5,6};
        int n = arr.length;
        boolean flag = false;

        for (int i = 0; i < n; i++) {

            int leftsum = 0;
            int rightsum = 0;

            for (int j = 0; j < i; j++) {
                leftsum += arr[j];
            }

            for (int j = i + 1; j < n; j++) {
                rightsum += arr[j];
            }

            if (leftsum == rightsum) {
                System.out.println("The pivot index is " + i);
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("The pivot index is not found");
        }
    }
}
