package trees;

import java.util.Stack;

public class postOrderIterative {

    public static void post(Node root) {
        Stack<Node> st = new Stack<>();
        Stack<Node> st1 = new Stack<>();
        if (root != null) st.push(root);
        while (st.size() > 0) {
            Node top = st.pop();
            st1.push(top);
            if (top.left != null) st.push(top.left);
            if (top.right != null) st.push(top.right);
        }
        while (st1.size() > 0) {
            Node node = st1.pop();
            System.out.print(node.val + " ");
        }
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

        post(a);
    }
}
