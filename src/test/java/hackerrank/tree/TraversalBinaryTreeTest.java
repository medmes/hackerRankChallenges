package hackerrank.tree;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TraversalBinaryTreeTest {

    @Test
    public void preOrderTraversal_shouldPrintBSTWithRootLeftRight() {
        //Given
        BinaryTreeNode root = null;
        root = HeightOfBinaryTree.insert(root, 3);
        root = HeightOfBinaryTree.insert(root, 2);
        root = HeightOfBinaryTree.insert(root, 5);
        root = HeightOfBinaryTree.insert(root, 1);
        root = HeightOfBinaryTree.insert(root, 4);
        root = HeightOfBinaryTree.insert(root, 6);
        root = HeightOfBinaryTree.insert(root, 7);

        PrintStream save_out=System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //When
        TraversalBinaryTree.preOrderTraversal(root);

        //Then
        assertEquals("3 2 1 5 4 6 7 ", out.toString());
        System.setOut(save_out);

    }

    @Test
    public void inOrderTraversal_shouldPrintBSTWithLeftRootRight() {
        //Given
        BinaryTreeNode root = null;
        root = HeightOfBinaryTree.insert(root, 3);
        root = HeightOfBinaryTree.insert(root, 2);
        root = HeightOfBinaryTree.insert(root, 5);
        root = HeightOfBinaryTree.insert(root, 1);
        root = HeightOfBinaryTree.insert(root, 4);
        root = HeightOfBinaryTree.insert(root, 6);
        root = HeightOfBinaryTree.insert(root, 7);

        PrintStream save_out=System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //When
        TraversalBinaryTree.inOrderTraversal(root);

        //Then
        assertEquals("1 2 3 4 5 6 7 ", out.toString());
        System.setOut(save_out);

    }

    @Test
    public void postOrderTraversal_shouldPrintBSTWithLeftRightRoot() {
        //Given
        BinaryTreeNode root = null;
        root = HeightOfBinaryTree.insert(root, 3);
        root = HeightOfBinaryTree.insert(root, 2);
        root = HeightOfBinaryTree.insert(root, 5);
        root = HeightOfBinaryTree.insert(root, 1);
        root = HeightOfBinaryTree.insert(root, 4);
        root = HeightOfBinaryTree.insert(root, 6);
        root = HeightOfBinaryTree.insert(root, 7);

        PrintStream save_out=System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        //When
        TraversalBinaryTree.postOrderTraversal(root);

        //Then
        assertEquals("1 2 4 7 6 5 3 ", out.toString());
        System.setOut(save_out);

    }
}