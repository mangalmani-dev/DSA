package LinkedList.DoublyLL;

class dNode{
    dNode next;
    dNode prev;
    int val;

    dNode(int val){
        this.val=val;
    }
}

public class doubly {

    public static void print (dNode head){   //
        dNode temp = head;

        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        dNode a = new dNode(10);
        dNode b = new dNode(20);
        dNode c = new dNode(30);
        dNode d = new dNode(40);

        a.next=b; b.prev=a;
        b.next=c; c.prev = b;
        c.next=d; d.prev =c;

        print(a);   // ✅ Works perfectly
    }
}
