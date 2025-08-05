package DS.binarySearchTree;

import com.sun.source.tree.Tree;

public class Searching {

    // time complexity O(h) and space complexity O(h) where he is the height of the tree
    public static TreeNode search(TreeNode root, int key) {
        if(root == null || root.val == key) {
            return root;
        }

        if(root.val < key) {
            return search(root.right, key);
        }

        return search(root.left, key);
    }

//    public static boolean search (TreeNode root, int key) {
//        TreeNode curr = root;
//
//        while(curr != null) {
//            if(curr.val == key) {
//                return true;
//            } else if(curr.val < key) {
//                curr = curr.right;
//            } else {
//                curr = curr.left;
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        System.out.println(search(root, 19) != null
                                            ? "Found"
                                            : "Not Found");

        System.out.println(search(root, 20) != null
                                            ? "Found"
                                            : "Not Found");
    }
}
