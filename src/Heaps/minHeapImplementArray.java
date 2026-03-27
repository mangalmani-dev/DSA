package Heaps;

import java.security.spec.RSAOtherPrimeInfo;

class minHeap{
  private  int [] arr ;
    private int size;

    minHeap(int capacity){
        arr= new int[capacity];
        size=0;
    }
    public void add(int num){
        if(size== arr.length){
            System.out.println("heap is full");
        }
     arr[size++]= num;
     upheapify(size-1);

    }
    public void upheapify(int idx) {
        if(idx==0)return;
        int parent = (idx - 1) / 2;
        if (arr[idx] < arr[parent]) {
            swap(idx, parent);
            upheapify(parent);
        }
    }
    public void swap(int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public int peek(){
        if(size==0){
            System.out.println("Heps is empty");
            return -1;
        }
        return arr[0];
    }

    public int size(){
        return size;
    }

    public int remove(){
        if(size==0)return -1;
       int peek = arr[0];
       swap(0,size-1);
       size--;
     downhepify(0);
     return peek;
    }

    public void downhepify(int idx){
        if(idx>=size)return;
         int lc = 2*idx+1;
         int rc = 2*idx+2;
         int mindx = idx;
         if( lc<size &&arr[lc]<arr[mindx])mindx=lc;
         if( rc<size &&arr[rc]<arr[mindx])mindx= rc;
         if(mindx==idx)return;
         swap(idx,mindx);
         downhepify(mindx);
    }


}

public class minHeapImplementArray {
    public static void main(String[] args) {
        minHeap pq = new minHeap(5);
        pq.add(1);
        pq.add(2);
        pq.add(3);
        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq.peek());


    }
}
