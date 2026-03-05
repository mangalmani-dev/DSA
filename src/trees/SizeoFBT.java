package trees;

public class SizeoFBT {
    public static int size(Node a){
        if(a==null)return 0;   // base
       return 1+size(a.left)+size(a.right);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node g = new Node(6);
        Node f = new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f;c.right=g;

        System.out.println( size(a));
    }
}
