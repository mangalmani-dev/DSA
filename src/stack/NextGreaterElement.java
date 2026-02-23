package stack;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int [] arr = {1,3,2,1,8,6,3,4};
        int [] ans = new int[arr.length];
        int n = arr.length;

        // before
        for (int ele : arr){
            System.out.print(ele +" ");
        }

         // array method
//        for (int i = 0; i < arr.length; i++) {
//            ans[i]=-1;
//            for (int j = i+1; j <arr.length ; j++) {
//                if(arr[j]>arr[i]){
//                    ans[i]=arr[j];
//                    break;
//                }
//            }
//        }


        // now stack method

        Stack <Integer> st = new Stack<>();
        ans[n-1]= -1;
        st.push(arr[n-1]);

        for (int i = n-2; i >=0 ; i--) {
            while (st.size() > 0 && st.peek() < arr[i]) {
                st.pop();
            }
            if(st.size()==0)ans[i]=-1;
            else ans[i]=st.peek();
            st.push(arr[i]);
        }




        System.out.println();
        // after
        for (int ele : ans){
            System.out.print(ele +" ");
        }
    }
}
