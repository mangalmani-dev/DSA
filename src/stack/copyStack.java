package stack;

import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {
        Stack  <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        Stack <Integer> st1 = new Stack<>();
        while (st.size()>0){
            st1.push(st.pop());
            st1.push(st.pop());
            st1.push(st.pop());
            st1.push(st.pop());
        }
        System.out.println(st1);
//        st1.push(st.pop());
//        st1.push(st.pop());
//        st1.push(st.pop());
//        st1.push(st.pop());
//        System.out.println(st1);

        Stack <Integer> st2 = new Stack<>();
        st2.push(st1.pop());
        st2.push(st1.pop());
        st2.push(st1.pop());
        st2.push(st1.pop());
        System.out.println(st2);
    }
}
