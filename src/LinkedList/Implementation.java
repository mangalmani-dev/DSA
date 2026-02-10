package LinkedList;
class SLL {
    Node head;
    Node tail;
    int size;
 void insertAtEnd(int val){
      Node temp = new Node(val);
      if(head == null)head = tail =temp;
      else {
          tail.next=temp;
          tail = temp;
      }
      size++;
 }
  void display( ){
     Node temp = head;
     while (temp !=null){
         System.out.print(temp.val +" ");
         temp= temp.next;
     }
      System.out.println();
 }

 void size(){
     System.out.println(size);
 }

    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null)head = tail =temp;
        else {
           temp.next=head;
           head=temp;
        }
        size++;
    }

    void insert(int idx , int val){

     if(idx ==0){
         insertAtHead(val);
         return;
     }
     if(idx==size){
         insertAtEnd(val);
         return;
     }
     if(idx >size){
         System.out.println("Invalid index");
         return;
     }

        Node temp = new Node(val);
         Node x =head;
         // loops through index
        for (int i = 0; i < idx-1; i++) {
            x=x.next;
        }
        // insertion
        temp.next=x.next;
        x.next=temp;
        size++;
    }

    int get(int idx){
        if(idx ==0){
             return head.val;
        }
        if(idx==size){
        return tail.val;
        }
        if(idx >size){
              return -1;
        }
        Node x =head;
        for (int i = 0; i <idx; i++) {
           x=x.next;
        }
        return x.val;
    }

    void deleteAtHead() throws Error{
     if(head==null)throw  new Error("null hai");
     head= head.next;
     size--;
    }

    void delete(int idx) throws Error{
        if(head==null)throw  new Error("null hai");
        if(idx<0 ||  idx>size){
            throw new Error("Jayada hai");
        }

        Node temp =head;
        for (int i = 0; i < idx-1; i++) {
            temp=temp.next;
        }
        if(temp.next==tail)tail=temp;
        temp.next= temp.next.next;
        size--;
    }
}
public class Implementation {
    public static void main(String[] args) {
     SLL List = new SLL();
        List.insertAtEnd(100);
        List.insertAtEnd(200);
        List.insertAtEnd(300);
        List.insertAtEnd(400);
        List.insertAtEnd(500);
        List.insertAtEnd(600);
        List.display();
        List.delete(5);
        List.display();
        System.out.println(List.tail.val);











    }
}
