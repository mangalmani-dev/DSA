package sorting;

public class insertionSort {
    public  static void print (int [] arr){
        for (int ele :arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public  static void swap (int []arr , int i,int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public static void main(String[] args) {
        int [] arr = {12,32,4,23,45,1,44};
        int n = arr.length;
        print(arr);
        for (int i = 1; i <n ; i++) {
            for (int j = i; j >=1 ; j--) {
                if(arr[j]<arr[j-1])swap(arr,j,j-1);
                else break;
            }
        }
        print(arr);

    }
}
