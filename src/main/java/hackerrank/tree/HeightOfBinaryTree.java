package hackerrank.tree;

public class HeightOfBinaryTree {


    public static int height(Node root) {
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

    public static Node insert(Node root, int data) {
        //Check if root is null
        if (root == null) {
            return new Node(data);
        } else {
            Node currentNode;
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

/**
 * Node Class
 */
class Node {
    //Data
    private int data;
    // Left Reference Node
    private Node left;
    // Right Reference Node
    private Node right;

    public Node(int data) {
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

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
