package DS.binarySearchTree;

public class Deletion {
    public static TreeNode deletion(TreeNode root, int key) {

        if(root == null) {
            return root;
        }

        if(root.val > key) {
            root.left = deletion(root.left, key);
        } else if(root.val < key) {
            root.right = deletion(root.right, key);
        } else {
            // when both the roots are present
            if(root.left == null) {
                return root.right;
            }
            if(root.right == null) {
                return root.left;
            }

            TreeNode succ = successorNode(root);
            root.val = succ.val;
            root.right = deletion(root.right, succ.val);
        }
        return root;
    }

//    public static TreeNode delIterative(TreeNode root, int key) {
//        TreeNode curr = root;
//        TreeNode prev = null;
//
//        if(curr != null && curr.val != key) {
//            prev = curr;
//            if(curr.val > key) {
//                curr = curr.left;
//            } else {
//                curr = curr.right;
//            }
//        }
//
//        // if key is not present
//        if(curr == null) {
//            return root;
//        }
//
//        // check if the node to be deleted has at most one node
//        if(curr.left != null || curr.right != null) {
//            TreeNode newCurr;
//
//            if(curr.left == null) {
//                newCurr = curr.right;
//            } else {
//                newCurr = curr.left;
//            }
//
//            // check if the node to be deleted is root
//            if(prev == null) {
//                return newCurr;
//            }
//
//            // Check if the node to be deleted is prev's left or
//            // right child and then replace this with newCurr.
//            if (curr == prev.left)
//                prev.left = newCurr;
//            else
//                prev.right = newCurr;
//        } else {
//
//            // Node to be deleted has two children.
//            TreeNode p = null;
//            TreeNode temp = curr.right;
//            while (temp.left != null) {
//                p = temp;
//                temp = temp.left;
//            }
//
//            if (p != null)
//                p.left = temp.right;
//            else
//                curr.right = temp.right;
//
//            curr.val = temp.val;
//        }
//        return root;
//        }
//    }
//
    public static TreeNode successorNode(TreeNode curr) {
        curr = curr.right;
        while(curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    public static void inOrder(TreeNode root) {
        if(root != null) {
            inOrder(root.left);
            System.out.println(root.val + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(18);

        int x = 15;
        root = deletion(root, x);
        inOrder(root);
    }
}
