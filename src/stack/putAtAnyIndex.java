package stack;

import java.util.Stack;

public class putAtAnyIndex {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);

        int x = 500;
        Stack <Integer> st1 = new Stack<>();

        while (st.size()>1){
            st1.push(st.pop());
        }
        st.push(x);

        while (st1.size()>0){
            st.push(st1.pop());
        }
        System.out.println(st);

    }
}
