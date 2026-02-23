package stack;

import java.util.Stack;

public class previousGreater {
    public static void main(String[] args) {
        int  [] arr = {100 , 80 , 60 ,70 ,60 , 75,85};
        int [] ans = new int[arr.length];

        for (int ele : arr){
            System.out.print(ele + " ");
        }
        Stack <Integer> st = new Stack<>();
        ans [0] = -1;
        st.push(arr[0]);

        for (int i = 1; i < arr.length ; i++) {

            while (st.size() > 0 && st.peek() < arr[i]) {
                st.pop();
            }
            if(st.size()==0)ans[i]=-1;
            else ans[i]=st.peek();
            st.push(arr[i]);
        }
        System.out.println();

        for (int ele : ans){
            System.out.print(ele + " ");
        }

    }
}
