package com.thecollinsbyte.dsa;

public class BinaryTree<T> {

    private Node<T> root;

    private static class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;

        Node(T data) {
            this.data = data;
        }
    }

    public int height() {
        return height(root);
    }

    private int height(Node<T> node) {
        if(node == null) return -1;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public boolean search(T value) {
        return search(root, value);
    }

    private boolean search(Node<T> node, T value) {
        if(node == null) return false;
        if(node.data.equals(value)) return true;
        return search(node.left, value) || search(node.right, value);
    }

    public void insert(T value) {
        root = insert(root, value);
    }

    private Node<T> insert(Node<T> node, T value) {
        if (node == null) return new Node<>(value);
        if (node.left == null) node.left = insert(node.left, value);
        else if (node.right == null) node.right = insert(node.right, value);
        else node.left = insert(node.left, value);
        return node;
    }
}
