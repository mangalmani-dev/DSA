package LinkedList;

public class printReverse {
    public static void print(Node head){
        if(head ==null)return;
        print(head.next);
        System.out.println(head.val);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next=b;
        b.next=c;
        c.next=d;
        print(a);
    }
}
