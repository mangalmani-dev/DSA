package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);
        int n = q.size();

  // created a stack
        Stack <Integer> st = new Stack<>();
         while (q.size()>0){
            st.push(q.remove());
         }
        System.out.println(st);


         // queue is reverse
         while (st.size()>0){
             q.add(st.pop());
         }
        System.out.println(q);
    }
}
