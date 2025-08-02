package DS.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {

    public static void inOrderDFS (Node root) {
        if(root == null) {
            return;
        }
        inOrderDFS(root.left);
        System.out.println(root.data + " "  );
        inOrderDFS(root.right);
    }

    public static void preOrderDFS (Node root) {
        if(root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preOrderDFS(root.left);
        preOrderDFS(root.right);
    }

    public static void postOrderDFS (Node root) {
        if(root == null) {
            return;
        }
        postOrderDFS(root.left);
        postOrderDFS(root.right);
        System.out.println(root.data + " ");
    }

    public static void levelOrderBFS(Node root){
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            Node node = q.poll();
            System.out.println(node.data + " ");

            if(root.left != null) {
                q.add(root.left);
            } else if (root.right != null) {
                q.add(root.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5 );

        System.out.print("In-order DFS: ");
        inOrderDFS(root);
        System.out.print("\nPre-order DFS: ");
        preOrderDFS(root);
        System.out.print("\nPost-order DFS: ");
        postOrderDFS(root);
        System.out.print("\nLevel order: ");
        levelOrderBFS(root);
    }
}
