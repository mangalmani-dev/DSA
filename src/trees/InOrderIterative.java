package trees;

import java.util.Stack;

public class InOrderIterative {
    public static void inorder(Node root){
        Stack<Node> st = new Stack<>();
        Node temp = root;
        while (true) {
            if (temp != null) {
                st.push(temp);
                temp = temp.left;
            } else {
                if(st.size()==0)break;
                Node top = st.pop();
                System.out.println(top.val);
                temp = top.right;
            }
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

        inorder(a);
    }
}
