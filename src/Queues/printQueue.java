package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class printQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> r = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);


//        while (q.size()>0){
//            System.out.println(q.peek());
//            q.poll();
//        }

        while (q.size()>0){
            r.add(q.remove());
        }

        System.out.println(r);

        while (r.size()>0){
            q.add(r.remove());
        }
        System.out.println(q);
    }
}
