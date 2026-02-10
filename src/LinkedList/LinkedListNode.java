package LinkedList;
class Node{
    int val;
    Node next;
     Node(int val){
         this.val=val;
     }

}
public class LinkedListNode {
    public static void main(String[] args) {
      Node a = new Node(10);
      Node b = new Node(2);
     Node c = new Node(30);
     Node d= new Node(40);
     a.next = b;
     b.next=c;
     c.next=d;
        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(c.next.val);







    }
}

