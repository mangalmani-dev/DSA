package Heaps;

import java.util.PriorityQueue;

public class minheaps {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        System.out.println(pq);
        pq.add(20);
        System.out.println(pq);
        pq.add(300);
        System.out.println(pq);
        pq.add(4);
        pq.remove();
        System.out.println(pq);
        pq.add(1);
        pq.add(50);
        System.out.println(pq);
    }
}
