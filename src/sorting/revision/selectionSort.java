package sorting.revision;

public class selectionSort {
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,3,5,7,6,8,9};
        int n = arr.length;
//        print(arr);

//        for (int i = 0; i <n-1; i++) {
//            int min = Integer.MAX_VALUE;
//            int mindx = -1;
//            for (int j = i; j <n ; j++) {
//                if(arr[j]<min){
//                    min = arr[j];
//                    mindx = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i]= arr[mindx];
//            arr[mindx]= temp;
//        }

        // second smallest element

        for (int i = 0; i < 2; i++) {
            int min = Integer.MAX_VALUE;
            int smx = 0;
            for (int j = 0; j < n; j++) {
                if(arr[i]<min){
                    smx = min;
                    min = arr[j];
                }
            }
        }



//
//
//        System.out.println();
//        print(arr);

    }
}
