package Queues;

import stack.LinkeListImplementation;

public class ImplementationLinkedList {
    public static class Node{  // user defined data type
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }

    public static class LLqueue{
         Node head = null;
         Node tail = null;
          int size;

           // function add
          public void add(int val){
             Node temp = new Node(val);
             if(head==null){
                 head=temp;
                 tail=temp;
             }
             else {
                 tail.next=temp;
                 tail=temp;
             }
             size++;
         }
         // function remove
         public int remove(){
              int temp = head.val;
              head=head.next;
              return temp;
         }
         // fuction display
         public void display(){
              Node temp = head;
              while(temp!=null){
                  System.out.println(temp.val);
                  temp=temp.next;
              }
         }

        // peek function
        int peek (){
              return head.val;
        }
    }
    public static void main(String[] args) {
    LLqueue a = new LLqueue();
    a.add(10);
    a.add(20);
    a.add(30);
    a.add(40);
      a.display();
      a.remove();
      System.out.println();
      a.display();
        System.out.println();
        System.out.println(a.peek());

    }
}
