package trees;

public class revision {

    // disply
    public static void display(Node root){
        if(root==null)return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    // sum
    public static int sum(Node root){
        if(root==null)return 0;
        return root.val + sum(root.left)+sum(root.right);
    }
   // prod
    public static int prod(Node root){
        if(root==null)return 1;
        return root.val * prod(root.left) *prod(root.right);
    }

    // max
    public static int max(Node root){

        if(root==null)return Integer.MIN_VALUE;
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a,Math.max(b,c));
    }
  // size
    public static int size(Node root){
        if(root==null)return 0;
        return 1+size(root.left)+size(root.right);
    }

    // level
    public static int level(Node root){
        if(root==null)return 0;
        return 1 +Math.max(level(root.left),level(root.right));
    }

      // count leaf node

    public static int leaf(Node root){
        if(root==null)return 0;
        if(root.left ==null && root.right==null)return 1;
         return leaf(root.left)+leaf(root.right);
    }

    public static void print(Node root){
        if(root==null)return;
        if(root.left==null && root.right==null){
            System.out.println(root.val);
        }
        print(root.left);
        print(root.right);
    }

    // count the node with one child

    public static int Count1(Node root){
        if(root==null)return 0;

        if(root.left==null && root.right!=null)return 1;
        if(root.left!=null  && root.right==null)return 1;
        return Count1(root.left)+Count1(root.right);
    }
    public static void preorder(Node root){
        if(root==null)return;
        System.out.print(root.val +" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void Inorder(Node root){
        if(root==null)return;
        Inorder(root.left);
        System.out.print(root.val +" ");
          Inorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val +" ");
    }

    public static void main(String[] args) {
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


//        display(a);
//        System.out.println();
//        System.out.println("sum :");
//        System.out.println(sum(a));
//        System.out.println("Product :");
//        System.out.println(prod(a));
//        System.out.println("Max value:");
//        System.out.println(max(a));
//        System.out.println("Size of treee:");
//        System.out.println(size(a));
//        System.out.println("Level of ");
//        System.out.println(level(a));
//        System.out.println("No of leaf node");
//        System.out.println(leaf(a));
//
//        System.out.println("Print the leaf node");
//        print(a);
//
//        System.out.println("Node with 1 child");
//        System.out.println(Count1(a));

        System.out.println("Traversal pre order :");
        preorder(a);

        System.out.println();
        System.out.println("Traversal Inorder :");
        Inorder(a);

        System.out.println();
        System.out.println("Postorder hai");
        postorder(a);


    }
}
