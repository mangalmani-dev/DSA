package trees;

import java.util.Stack;

public class PreOrderIterative {

    public static void pre(Node root){
        Stack<Node> st = new Stack<>();
       if(root!=null) st.push(root);

        while (st.size()>0){
            Node node = st.pop();
            System.out.print(node.val+" ");
           if(node.right!=null) st.push(node.right);
           if(node.left!=null) st.push(node.left);
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

        pre(a);
    }
}
