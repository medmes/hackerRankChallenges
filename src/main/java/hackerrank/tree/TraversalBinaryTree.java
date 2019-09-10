package hackerrank.tree;

public class TraversalBinaryTree {
    private TraversalBinaryTree() {
    }

    /**
     * The PreOrder Traversal is a traversal with the following order:
     * root -> left -> right
     *
     */
    public static void preOrderTraversal(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getData());
        System.out.print(" ");
        preOrderTraversal(root.getLeft());
        preOrderTraversal(root.getRight());
    }

    /**
     * The InOrder Traversal is a traversal with the following order:
     * left -> root -> right
     *
     */
    public static void inOrderTraversal(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.getLeft());
        System.out.print(root.getData());
        System.out.print(" ");
        inOrderTraversal(root.getRight());
    }

    /**
     * The PostOrder Traversal is a traversal with the following order:
     * left -> root -> right
     *
     */
    public static void postOrderTraversal(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.getLeft());
        postOrderTraversal(root.getRight());
        System.out.print(root.getData());
        System.out.print(" ");
    }
}
