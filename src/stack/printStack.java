package stack;

import java.util.Stack;

public class printStack {

    public static void display(Stack<Integer> st){
        if(st.size()==0)return;
        int top = st.pop();
        display(st);
        System.out.println(top);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

//        System.out.println(st);

//        Stack<Integer> st1 = new Stack<>();
//
//        while (st.size()>0){
//             st1.push(st.pop());
//        }
//        while (st1.size()>0){
//            int x = st1.pop();
//            System.out.print(x +" ");
//            st.push(x);
//        }
//        System.out.println(st);


        // print stack using array
//          int n = st.size();
//
//          int [] arr = new int[n];
//
//        for (int i = n-1; i >=0 ; i--) {
//            arr[i]= st.pop();
//        }
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+" ");
//            st.push(arr[i]);
//        }


        // print stack using recurssion


        display(st);


    }
}
