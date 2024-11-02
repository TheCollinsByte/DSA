package com.thecollinsbyte.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {

    public BinaryTree<Integer> tree;

    /* Tree structure representation for the setup method before each test.

           5
         /   \
        3     7
       / \   / \
      2   4 6   8

    */

    @BeforeEach
    public void setUp() {
        tree = new BinaryTree<>();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
    }

    @Test
    public void testInsert() {
    /*
               5
             /   \
            3     7
           / \   / \
          2   4 6   8
         /
        9
    */
        tree.insert(9);
        assertTrue(tree.search(2));
        assertEquals(3, tree.height());
    }


    @Test
    public void testInorderTraversal() {
        assertEquals(Arrays.asList(2, 3, 4, 5, 6, 7, 8), tree.inorderTraversal());
    }


    @Test
    public void testPreorderTraversal() {
        assertEquals(Arrays.asList(5, 3, 2, 4, 7, 6, 8), tree.preorderTraversal());

    }


    @Test
    public void testPostorderTraversal() {
        assertEquals(Arrays.asList(2, 4, 3, 6, 8, 7, 5), tree.postorderTraversal());
    }
}
