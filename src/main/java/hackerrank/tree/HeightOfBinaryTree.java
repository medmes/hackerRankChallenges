package hackerrank.tree;

public class HeightOfBinaryTree {
    private HeightOfBinaryTree() {}

    public static int height(BinaryTreeNode root) {
        // Write your code here.
        int heightLeft = 0;
        int heightRight = 0;
        //Check if root is inexistent, so no height!
        if (root == null) {
            return -1;
        }
        if (root.getLeft() != null) {
            heightLeft = 1 + height(root.getLeft());
        }
        if (root.getRight() != null) {
            heightRight = 1 + height(root.getRight());
        }
        return Math.max(heightLeft, heightRight);
    }

    public static BinaryTreeNode insert(BinaryTreeNode root, int data) {
        //Check if root is null
        if (root == null) {
            return new BinaryTreeNode(data);
        } else {
            BinaryTreeNode currentNode;
            if (data <= root.getData()) {
                currentNode = insert(root.getLeft(), data);
                root.setLeft(currentNode);
            } else {
                currentNode = insert(root.getRight(), data);
                root.setRight(currentNode);
            }
        }
        return root;
    }
}
