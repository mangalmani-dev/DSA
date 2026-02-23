package Queues;

public class ImplementationUsingLL {
    public static class Node{  // user defined data type
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }

    public static class CLL{
        Node head=null;
        Node tail =null;
        int size =0;

        void add(int val){
            Node temp = new Node(val);
            if(head ==null){
                head=tail=temp;
                tail.next=head;
            }
            else{
                tail.next=temp;
                tail=temp;
                tail.next=head;
            }
        }

        int remove(){
            if(head==null){
                System.out.print("Queue is empty");
            }
            else{
                head=head.next;
                tail.next=head;
            }
            return head.val;
        }

        void display(){
            Node temp = head;

            if (head == null) return;
            while (true) {
                System.out.print(temp.val + " ");
                temp = temp.next;
                if (temp == head) break;
            }
        }
    }
    public static void main(String[] args) {
        CLL c1 = new CLL();
        c1.add(10);
        c1.add(20);
        c1.add(30);
        c1.add(40);
        c1.display();
        System.out.println();
        c1.remove();
        c1.display();
    }
}
