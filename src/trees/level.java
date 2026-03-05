package trees;

public class level {
    public static int lev(Node root){
        if(root==null)return 0;
        return 1+ Math.max(lev(root.left),lev(root.right));
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(0);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f;c.right=g;

        System.out.println(lev(a));
    }
}
