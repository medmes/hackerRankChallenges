package hackerrank.tree;

public class SearchElementInBinarySearchTree {

    private SearchElementInBinarySearchTree() {

    }

    /**
     * Searching in BinaryTree Search, is just following the insertion order
     * @param root
     * @param data
     * @return
     */
    public static BinaryTreeNode search(BinaryTreeNode root, int data) {
        if (root == null || data == root.getData()) {
            return root;
        }  else {
            return isLower(root, data)?search(root.getLeft(), data):search(root.getRight(), data);
        }
    }

    private static boolean isLower(BinaryTreeNode root, int data) {
        return data < root.getData();
    }
}
