package trees;

public class maxValue {
    public static int max(Node root){
        if(root==null)return Integer.MIN_VALUE;

        int a = root.val; int b = max(root.left); int c = max(root.right);
        return Math.max(a,Math.max(b,c));

    }

    public static int min(Node root){
        if(root==null)return Integer.MAX_VALUE;

        int a = root.val; int b = min(root.left); int c = min(root.right);
        return Math.min(a,Math.min(b,c));
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

        System.out.println(max(a));
        System.out.println(min(a));
    }
}
