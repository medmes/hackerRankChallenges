package hackerrank.tree;

public class BFSTraversalBinaryTree {

    private BFSTraversalBinaryTree() {

    }

    /**
     * O(n^2)
     * BinaryTreeNode root
     * @param root
     */
    public static void bfsTraversal(BinaryTreeNode root) {
        int height = HeightOfBinaryTree.height(root);
        for (int i=1; i<=height; i++) {
            printLevel(root, i);
        }
    }

    private static void printLevel(BinaryTreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            printNode(root);
        }
        else if (level > 1) {
            printLevel(root.getLeft(), level - 1);
            printLevel(root.getRight(), level - 1);
        }
    }

    private static void printNode(BinaryTreeNode node) {
        System.out.print(node.getData() + " ");
    }
}
