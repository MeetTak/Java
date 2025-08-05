package DS.binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class Insertion {

    // time complexity O(h) and space complexity O(h) where h is the height of the tree
    // insertion in BST using recursion
    public static TreeNode insertion (TreeNode root, int key) {

        if(root == null) {
            return new TreeNode(key);
        }

        if(root.val == key) {
            return root;
        }

        if(key < root.val) {
            root.left = insertion(root.left, key);
        } else {
            root.right = insertion(root.right, key);
        }

        return root;
    }

    // time complexity O(h) and space complexity O(1) where h is the height of the tree
    // insertion in BST using iteratation
//    public static Node insertion (Node root, int key) {
//        Node temp = new Node(key);
//
//        if(root == null) {
//            return temp;
//        }
//
//        Node curr = root;
//        Node parent = null;
//
//        // finding parent for the key
//        while(curr != null) {
//            parent = curr;
//
//            if(curr.val > key) {
//                curr = curr.left;
//            } else if(curr.val < key) {
//                curr = curr.right
//            } else {
//                return root;
//            }
//        }
//
//        // finding either the left or right for the parent
//        if(parent.val > key) {
//            parent.left = temp;
//        } else {
//            parent.right = temp;
//        }
//
//        return root;
//    }

    public static void levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            TreeNode temp = q.poll();
            System.out.println(temp.val + " ");

            if(temp.left != null) {
                q.add(temp.left);
            }
            if(temp.right != null) {
                q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = null;

        root = insertion(root, 50);
        root = insertion(root, 30);
        root = insertion(root, 20);
        root = insertion(root, 40);
        root = insertion(root, 70);
        root = insertion(root, 60);
        root = insertion(root, 80);

        //print the root
        levelOrder(root);
    }
}
