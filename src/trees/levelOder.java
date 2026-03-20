package trees;

import java.io.FilterOutputStream;
import java.util.LinkedList;
import java.util.Queue;

public class levelOder {
      // class pairs

    public static class pair{
        Node node;
        int level;
        pair(Node node , int level){
            this.node=node;
            this.level=level;
        }
    }

//    public static void level(Node root){
//        int prevlevel = 0;
//        Queue<pair> q= new LinkedList<>();
//         if(root!=null)q.add(new pair(root,0));
//        while (q.size()>0){
//            pair front = q.remove();
//            Node temp = front.node;
//            int lev = front.level;
//            if(lev!=prevlevel){
//                System.out.println();
//            prevlevel++;
//            }
//            System.out.print(temp.val+" ");
//            if(temp.left!=null)q.add(new pair(temp.left,lev+1));
//            if(temp.right!=null)q.add(new pair(temp.right,lev+1));
//        }
//    }

    public static void level(Node root) {
        int prevlevel = 0;
        Queue<pair> q = new LinkedList<>();
        if (root != null) q.add(new pair(root, 0));
        while (q.size() > 0) {
            pair front = q.remove();
            Node temp = front.node;
            int lev = front.level;
            if (lev != prevlevel) {
                System.out.println();
                prevlevel++;
            }
            System.out.print(temp.val+" ");
            if (temp.left != null) q.add(new pair(temp.left, lev + 1));
            if (temp.right != null) q.add(new pair(temp.right, lev + 1));
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        g.left=h;

        level(a);

    }
}
