package LinkedList;

public class leftMiddle {
    public static void print(Node head){
        if(head ==null)return;
        System.out.print(head.val +" ");
        print(head.next);

    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        print(a);

        Node slow = a;
        Node fast = a;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow = slow.next;
        System.out.println();
        print(a);

//        System.out.println(slow.val);


    }
}
