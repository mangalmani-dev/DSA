package array;

public class NextGreatestElement {
    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50,60};
        int n = arr.length;

        int [] ans = new int[n];
        ans[n-1]=-1;
        for (int ele :arr){
            System.out.print(ele +" ");
        }
          // Method 1 : brut force
//        for (int i = 0; i <n-1 ; i++) {
//             int mx= Integer.MIN_VALUE;
//            for (int j = i+1; j <n ; j++) {
//                mx=Math.max(mx,arr[j]);
//            }
//            ans[i] =mx;
//            }

           // method 2  : optimize code

          int nge = arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
            ans[i]=nge;
            nge =Math.max(nge,ans[i]);
        }
          // for printing value
        System.out.println();
            for (int ele :ans){
                System.out.print(ele +" ");
            } }


    }

