package Heaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallest {
    public static void main(String[] args) {
        int[] arr = {5, 4, 9, 7, 6, 1};
        int k = 3;
    // maxheaps
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
          for(int ele : arr){
              pq.add(ele);
              if(pq.size()>k)pq.remove();
          }

        System.out.println(pq.peek());
        }
    }

