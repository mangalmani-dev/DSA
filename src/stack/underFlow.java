package stack;

import java.util.Stack;

public class underFlow {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);  // 10 20 30 40 50
        st.pop();
        System.out.println(st);  // 10 20 30 40
        st.pop();
        System.out.println(st);  // 10 20 30
        st.pop();
        System.out.println(st); // 10 20
        st.pop();
        System.out.println(st);  // 10
        st.pop();
        System.out.println(st); // error
        st.pop();

    }
}
