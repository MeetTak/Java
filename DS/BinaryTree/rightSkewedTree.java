package DS.BinaryTree;

public class rightSkewedTree {
    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void printTree(Node root) {
        if(root != null) {
            System.out.println(root.data);
            printTree(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 1);
        insert(root, 2);
        insert(root, 3);

        printTree(root);
    }
}
