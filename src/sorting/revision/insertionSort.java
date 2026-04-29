package sorting.revision;

public class insertionSort {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }
    public static void main(String[] args) {
        int [] arr =  {2,3,1,4,5};
        int n = arr.length;
        print(arr);

        for (int i = 0; i < n; i++) {
            for (int j = i; j >=1 ; j--) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] =arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        print(arr);

    }
}
