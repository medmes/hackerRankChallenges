package hackerrank.tree;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class BFSTraversalBinaryTreeTest {

    @Test
    public void bfsTraversal_shouldPrintByLevelOrderWithoutQueue() {
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
        BFSTraversalBinaryTree.bfsTraversalWithoutQueue(root);

        //Then Check print out:
        assertEquals("3 2 5 1 4 6 7", out);
        System.setOut(save_out);
    }

    @Test
    public void bfs_shouldPrintByLevelOrderUsingQueue() {
        //Given
        BinaryTreeNode root = null;
        root = HeightOfBinaryTree.insert(root, 3);
        root = HeightOfBinaryTree.insert(root, 2);
        root = HeightOfBinaryTree.insert(root, 5);
        root = HeightOfBinaryTree.insert(root, 1);
        root = HeightOfBinaryTree.insert(root, 4);
        root = HeightOfBinaryTree.insert(root, 6);
        root = HeightOfBinaryTree.insert(root, 7);

        //When
        List oderLevelElements = BFSTraversalBinaryTree.bfs(root);

        //Then Check print out:
        assertThat(oderLevelElements)
                .isNotNull();
        assertThat(oderLevelElements)
                .containsSequence(3, 2, 5, 1, 4, 6, 7);
    }

}
