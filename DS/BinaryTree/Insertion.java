package DS.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Insertion {
    public static Node insert (Node root, int key) {
        if(root == null) {
            return new Node(key);
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            Node node = q.poll();

            // for left node
            if(node.left == null) {
                node.left = new Node(key);
                break;
            } else {
                q.add(node.left);
            }

            // for right node
            if(node.right == null) {
                node.right = new Node(key);
                break;
            } else {
                q.add(node.right);
            }
        }
        return root;
    }

    public static void levelOrderBFS (Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            Node node = q.poll();
            System.out.println(node.data + " ");

            // checking for the left and right nodes
            if(node.left != null) {
                q.add(node.left);
            }
//            else if(node.right != null) {
//                q.add(node.right);
//            }
            if(node.right != null) {
                q.add(node.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);

        System.out.print("Inorder traversal before insertion: ");
        levelOrderBFS(root);
        System.out.println();

        int key = 6;
        root = insert(root, key);

        System.out.print("Inorder traversal after insertion: ");
        levelOrderBFS(root);
        System.out.println();
    }
}
