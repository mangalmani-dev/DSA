package trees;

public class traversal {

    // Preorder Traversal (Root -> Left -> Right)
    public static void preorder(Node a) {
        if (a == null) return;
        System.out.print(a.val + " ");
        preorder(a.left);
        preorder(a.right);
    }

    // Inorder Traversal (Left -> Root -> Right)
    public static void Inorder(Node a) {
        if (a == null) return;
        Inorder(a.left);
        System.out.print(a.val + " ");
        Inorder(a.right);
    }

    // Postorder Traversal (Left -> Right -> Root)
    public static void postorder(Node a) {
        if (a == null) return;
        postorder(a.left);
        postorder(a.right);
        System.out.print(a.val + " ");
    }

    public static void main(String[] args) {
        // Creating nodes
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node g = new Node(6);
        Node f = new Node(7);

        // Constructing the tree
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        // Printing the traversals
        System.out.print("Preorder: ");
        preorder(a);
        System.out.println();

        System.out.print("Inorder: ");
        Inorder(a);
        System.out.println();

        System.out.print("Postorder: ");
        postorder(a);
        System.out.println();
    }
}
