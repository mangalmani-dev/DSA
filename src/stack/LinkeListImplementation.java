package stack;

public class LinkeListImplementation {
    public static class Node{  // user defined data type
        int val;
        Node next;
        Node(int val){
             this.val=val;
        }
    }

    public static class LLStack{  // user defined data structure
        Node head = null;
        int size =0;

        void push(int x){
            Node temp = new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }

        int pop(){
            if(head==null){
                System.out.println("Size is zero for the LL");
                return -1;
            }
            else {
              int x = head.val;
              head=head.next;
               return x;
            }
        }

        int peek(){
           if(head==null){
               System.out.println("you are not able to see peek because stack is empty");
               return -1;
           }
           else {
               return head.val;
           }
        }
        void displayrev(){
           Node temp = head;
           while (temp!=null){
               System.out.println(temp.val);
               temp=temp.next;
           }
        }
        int size(){
           return size;
        }
        boolean isEmpty(){
            if(size==0)return true;
            else return false;
        }
        void displayrec(Node h){
            if(h==null)return;
             displayrec(h.next);
            System.out.println(h.val+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();

        }
    }


    public static void main(String[] args) {
        LLStack s= new LLStack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.displayrev();
        System.out.println();
        s.display();


    }
}
