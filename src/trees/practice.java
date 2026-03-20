package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class practice {
//    static int n=2;
//    public static void nth(Node root , int count ){
//        if(root==null)return;
//        if(count==n){
//            System.out.print(root.val+" ");
//        }
//        nth(root.left,count+1);
//        nth(root.right,count+1);
//    }

    // iterative preorder

    public static void preorder(Node root){
        Stack <Node> st = new Stack<>();
        if(root!=null)st.push(root);
        while (st.size()>0){
            Node top = st.pop();
            System.out.print(top.val+" ");
            if(top.right!=null)st.push(top.right);
            if(top.left!=null)st.push(top.left);

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

//        for (int i = 0; i < 6; i++) {
//            n=i;
//            nth(a,0);
//            System.out.println();
//        }

        preorder(a);
    }
}
