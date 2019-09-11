package hackerrank.tree;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;


public class SearchElementInBinarySearchTreeTest {

    private static final int ELEMENT_EXIST = 6;

    private static final int ELEMENT_NOT_EXIST = -1;

    @Test
    public void search_shouldReturnTheElementSearchedIfIsPresent() {

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
        BinaryTreeNode binaryTreeNode = SearchElementInBinarySearchTree.search(root, ELEMENT_EXIST);

        //Then
        assertThat(binaryTreeNode)
                .isNotNull();
        assertThat(binaryTreeNode.getData())
                .isEqualTo(ELEMENT_EXIST);
    }

    @Test
    public void search_shouldReturnNullIfIsNotPresent() {

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
        BinaryTreeNode binaryTreeNode = SearchElementInBinarySearchTree.search(root, ELEMENT_NOT_EXIST);

        //Then
        assertThat(binaryTreeNode)
                .isNull();
    }
}