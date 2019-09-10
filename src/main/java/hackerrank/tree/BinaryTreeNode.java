package hackerrank.tree;

/**
 * Node Class
 */
public class BinaryTreeNode {

    //Data
    private int data;
    // Left Reference Node
    private hackerrank.tree.BinaryTreeNode left;
    // Right Reference Node
    private hackerrank.tree.BinaryTreeNode right;

    public BinaryTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public hackerrank.tree.BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(hackerrank.tree.BinaryTreeNode left) {
        this.left = left;
    }

    public hackerrank.tree.BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(hackerrank.tree.BinaryTreeNode right) {
        this.right = right;
    }
}
