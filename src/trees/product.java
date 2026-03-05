package trees;

public class product {
    public static int prod(Node a){
        if(a==null)return 1;
        if(a.val==0)return 1;
        return a.val*prod(a.left)*prod(a.right);
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

        System.out.println(prod(a));
    }
}
