package sorting;

public class bubbleSortDecreasing {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7,8};
        int n = arr.length;
        boolean swapped=false;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

                }
            }
        }
        for (int ele :arr){
            System.out.print(ele +" ");
        }
    }
}
