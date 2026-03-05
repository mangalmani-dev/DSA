package trees;

public class TreeDisplay {
    public static void display(Node a){
         if(a==null)return;   // base
        System.out.print(a.val+" ");
        display(a.left);
        display(a.right);
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(10);
        Node d = new Node(6);
        Node e = new Node(5);
        Node f = new Node(11);
        Node h = new Node(100);

        // linking

        a.left=b; a.right=c;
        b.left=d;b.right=e;
        e.left=f;
        e.right=h;

        display(a);

    }
}
