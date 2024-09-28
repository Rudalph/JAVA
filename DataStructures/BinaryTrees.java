package DataStructures;

public class BinaryTrees {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;            
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public Node buildTree(int nodes[]){
           idx++;
           if(nodes[idx]==-1){
            return null;
           }
           Node newNode = new Node(nodes[idx]);
           newNode.left=buildTree(nodes);
           newNode.right=buildTree(nodes);
           return newNode;
        }
    }

    public static void preorder(Node root){
        if(root==null){
           return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data+" ");
    }

    public static int countOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes +1;
    }

    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sumOfNodes(root.left);
        int rightsum=sumOfNodes(root.right);
        return leftsum + rightsum + root.data;
    }

    public static int heightOfTree(Node root){
        if(root==null){
            return 0;
        }
        int leftheight = heightOfTree(root.left);
        int rightheight = heightOfTree(root.right);
        int myheight = Math.max(leftheight, rightheight)+1;

        return  myheight;
    }
    public static void main(String[] args) {
        int nodes [] = {3,9,20,-1,-1,15,7,8};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        preorder(root);
        // System.out.println("Inorder");
        // inorder(root);
        // System.out.println(" ");
        // postorder(root);
        // System.out.println(" ");
        // System.out.println(countOfNodes(root));
        // System.out.println(" ");
        // System.out.println(sumOfNodes(root));
        // System.out.println(" ");
        // System.out.println(heightOfTree(root));
    }
}

//Diameter of tree approach 1 and 2 Apna college 1hr 22mins vdo
//Subtree of another tree 

