package trees;

import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    public static void BFS(Node root){
        Queue<Node> q= new LinkedList<>();
         if(root!=null)q.add(root);
         while (q.size()>0){
              Node front = q.remove();
             System.out.print(front.val+" ");
             if(front.left!=null)q.add(front.left);
             if(front.right!=null) q.add(front.right);
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
        System.out.println("Level order");

        BFS(a);


    }
}
