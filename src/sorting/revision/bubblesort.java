package sorting.revision;

public class bubblesort {
    static int swapcount =0;
    public static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,4,1,6,7,8,9,3,2};
        int n = arr.length;
        print(arr);

//          bubble sort 1
//        for (int i = 0; i < n-1; i++) {
//            for (int j = 0; j <n-1 ; j++) {
//                if(arr[j]>=arr[j+1]){
//                    swap(arr,j,j+1);
//                }
//            }
//        }  Tc = O(n2)

        // bubble sort 2
                for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <n-1-i ; j++) {
                if(arr[j]>=arr[j+1]){
                    swap(arr,j,j+1);
                    swapcount++;
                }
            }
        }



       // bubble sort 3
//        for (int i = 0; i <n-1 ; i++) {
//           boolean swaped = false;
//            for (int j = 0; j < n-1-i; j++) {
//                if(arr[j]>arr[j+1]){
//                    swap(arr,j,j+1);
//                    swaped = true;
//                }
//            }
//            if(!swaped) break;
//        }
        System.out.println();
        print(arr);
        System.out.println();
        System.out.println(swapcount);
    }
}
