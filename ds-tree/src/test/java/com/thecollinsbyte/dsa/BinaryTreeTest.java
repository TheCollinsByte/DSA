package com.thecollinsbyte.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {

    public BinaryTree<Integer> tree;

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
        tree.insert(9);
        assertTrue(tree.search(2));
        assertEquals(4, tree.height());
    }
}
