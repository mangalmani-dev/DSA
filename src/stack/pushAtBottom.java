package stack;

import java.util.Stack;

public class pushAtBottom {

    public static void print(Stack<Integer> st, int x){

        if(st.isEmpty()){
            st.push(x);
            return;
        }

        int top = st.pop();

        print(st, x);

        st.push(top);
    }

    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        print(st,100 );

        System.out.println(st);
    }
}
