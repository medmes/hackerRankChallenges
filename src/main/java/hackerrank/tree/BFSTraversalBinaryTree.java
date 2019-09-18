package hackerrank.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSTraversalBinaryTree {

    private BFSTraversalBinaryTree() {

    }


    public static List bfs(BinaryTreeNode root) {
        Queue<BinaryTreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        List<Integer> elements = new ArrayList<>();
        while (!nodeQueue.isEmpty()) {
            elements.add(nodeQueue.peek().getData());
            // DeQueue from Queue and update the current Node to next Level nodes

            BinaryTreeNode currentNode = nodeQueue.poll();

            //EnQueue Left Child & Right Child
            if (currentNode.getLeft() != null) {
                nodeQueue.add(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                nodeQueue.add(currentNode.getRight());
            }
        }
        return elements;
    }


    /**
     * O(n^2)
     * BinaryTreeNode root
     * @param root
     */
    public static void bfsTraversalWithoutQueue(BinaryTreeNode root) {
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
