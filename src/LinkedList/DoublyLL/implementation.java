package LinkedList.DoublyLL;



class DLL{
    dNode head;
    dNode tail;
    int size;

    void display(){
        dNode temp = head;

        while (temp!=null) {
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertAtTail(int val){

        dNode temp = new dNode(val);

        if(size == 0){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void insertAtHead(int val){

        dNode temp = new dNode(val);

        if(size == 0){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insert(int idx , int val){

        if(idx == 0){
            insertAtHead(val);
            return;
        }

        if(idx == size){
            insertAtTail(val);
            return;
        }

        if(idx > size || idx < 0){
            System.out.println("Invalid index");
            return;
        }

        dNode temp = new dNode(val);
        dNode x = head;

        for (int i = 0; i < idx-1; i++) {
            x = x.next;
        }

        dNode y = x.next;

        x.next = temp;
        temp.prev = x;
        temp.next = y;
        y.prev = temp;

        size++;
    }

    void  deleteAtHead(){
        head = head.next;
        head.prev=null;
        size--;
    }
}

public class implementation {

    public static void main(String[] args) {

        DLL list = new DLL();

        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);

        list.display();
        System.out.println("Size: " + list.size);

        list.insertAtHead(100);
        list.display();
        list.insert(2,99);
        list.display();
        list.insert(5,2000);
        list.display();
        list.deleteAtHead();
        list.display();
    }
}
