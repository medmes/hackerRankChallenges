package hackerrank.tree;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class HeightOfBinaryTreeTest {

    private static final int BINARY_TREE_HEIGHT = 3;

    @Test
    public void height_shouldReturnTheHeightOfBinarytree() {
        // the height of a Binary Tree is:
        // the Max of left depth size and right depth size
        //Given
        Node root = null;
        root = HeightOfBinaryTree.insert(root, 3);
        root = HeightOfBinaryTree.insert(root, 2);
        root = HeightOfBinaryTree.insert(root, 5);
        root = HeightOfBinaryTree.insert(root, 1);
        root = HeightOfBinaryTree.insert(root, 4);
        root = HeightOfBinaryTree.insert(root, 6);
        root = HeightOfBinaryTree.insert(root, 7);

        //When
        int height = HeightOfBinaryTree.height(root);

        //Then
        assertThat(height)
                .isEqualTo(BINARY_TREE_HEIGHT);

    }

    @Test
    public void height_shouldReturnMinusOneBecauseTheRootIsInexistent() {
        // the height of a Binary Tree is:
        // the Max of left depth size and right depth size
        //Given
        Node root = null;

        //When
        int height = HeightOfBinaryTree.height(root);

        //Then
        assertThat(height)
                .isEqualTo(-1);

    }
}