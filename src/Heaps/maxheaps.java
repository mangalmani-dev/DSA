package Heaps;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class maxheaps {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(5);
        pq.add(40);
        System.out.println(pq+" "+ pq.peek());
        pq.remove();
        pq.add(4);
        System.out.println(pq+" "+ pq.peek());
        pq.remove();
        pq.add(62);
        System.out.println(pq+" "+ pq.peek());
        pq.add(70);
        System.out.println(pq+" "+ pq.peek());
        pq.add(60);
        System.out.println(pq+" "+ pq.peek());
    }
}
