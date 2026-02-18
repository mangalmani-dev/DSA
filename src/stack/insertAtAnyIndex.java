package stack;

import java.util.Stack;

public class insertAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        int idx=0;
        int n = 200;

        Stack <Integer> st1 = new Stack<>();
        while(st.size()>idx){
            st1.push(st.pop());
        }
        System.out.println(st1);

        st.push(n);
        while (st1.size()>0){
            st.push(st1.pop());
        }
        System.out.println(st);

    }
}
