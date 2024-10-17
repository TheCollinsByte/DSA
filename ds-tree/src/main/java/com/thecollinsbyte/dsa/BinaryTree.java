package com.thecollinsbyte.dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree<T> {

    private TreeNode<T> root;

    private static class TreeNode<T> {
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) {
            this.data = data;
        }
    }

    public int height() {
        return height(root);
    }

    private int height(TreeNode<T> node) {
        if(node == null) return -1;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public boolean search(T value) {
        return search(root, value);
    }

    private boolean search(TreeNode<T> node, T value) {
        if(node == null) return false;
        if(node.data.equals(value)) return true;
        return search(node.left, value) || search(node.right, value);
    }

    public void insert(T value) {
        if(root == null) {
            root = new TreeNode<>(value);
            return;
        }

        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode<T> current = queue.poll();

            if(current.left == null) {
                current.left = new TreeNode<>(value);
                return;
            } else if (current.right == null) {
                current.right = new TreeNode<>(value);
                return;
            }

            queue.offer(current.left);
            queue.offer(current.right);
        }
    }

    /**
     * Recursive Pre-Order Traversal and Iterative Pre-Order Traversal Of a Binary Tree
     */
    public List<T> preorderTraversal() {
        List<T> result = new ArrayList<>();
        preorderTraversal(root, result);
        return result;
    }

    private void preorderTraversal(TreeNode<T> node, List<T> result) {
        if (node == null) return;
        result.add(node.data);
        preorderTraversal(node.left, result);
        preorderTraversal(node.right, result);
    }

    // Tree Traversals
    public List<T> inorderTraversal() {
        List<T> result = new ArrayList<>();
        inorderTraversal(root, result);
        return result;
    }

    private void inorderTraversal(TreeNode<T> node, List<T> result) {
        if (node == null) return;
        inorderTraversal(node.left, result);
        result.add(node.data);
        inorderTraversal(node.right, result);
    }

    public List<T> postorderTraversal() {
        List<T> result = new ArrayList<>();
        postorderTraversal(root, result);
        return result;
    }

    private void postorderTraversal(TreeNode<T> node, List<T> result) {
        if(node == null) return;
        postorderTraversal(node.left, result);
        postorderTraversal(node.right, result);
        result.add(node.data);
    }
}
