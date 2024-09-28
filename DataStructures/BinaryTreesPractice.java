package DataStructures;

public class BinaryTreesPractice {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTrees {
        int idx = -1;

        public Node buildtree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }
    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        preorder(root.right);
        if(root.data==1){
            return;
        }
        preorder(root.left);
        
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, -1,-1, 3, 4, 5, -1, -1, 8, 9};
        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildtree(nodes);
        // System.out.print(root.data);
        System.out.println("Preorder sequence: ");
        preorder(root);
    }
}
