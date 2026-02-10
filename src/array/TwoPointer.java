package array;

public class TwoPointer {
    // swap functions
    public  static  void swap(int [] arr, int i , int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int n = arr.length;
        for (int ele :arr){
            System.out.print(ele +" ");
        }
        int i=0;
        int j=n-1;
        while (i<=j){
          swap(arr,i,j);
            i++;
            j--;
        }
        System.out.println();
        for (int ele :arr){
            System.out.print(ele +" ");
        }
    }
}
