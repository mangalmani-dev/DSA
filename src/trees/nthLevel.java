package trees;

public class nthLevel {

    static int n;

    public static void level(Node root, int level) {
        if (root == null) return;

        if (level == n) {
            System.out.print(root.val + " ");
        }

        level(root.left, level + 1);
        level(root.right, level + 1);
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node g = new Node(6);
        Node f = new Node(7);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = g;
        c.right = f;

        // print all levels
        for (int i = 0; i <= 2; i++) {
            n = i;
            level(a, 0);
            System.out.println();
        }
    }
}