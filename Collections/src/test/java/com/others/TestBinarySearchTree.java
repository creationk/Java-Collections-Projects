package com.others;

import lombok.Getter;
import lombok.ToString;
import org.junit.jupiter.api.Test;

public class TestBinarySearchTree {
    @Test
    void testBinarySearchTree() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(2);
        bst.insert(1);
        bst.insert(3);
        bst.insert(4);

        System.out.println(bst);

        bst.traverse();

        System.out.println(bst.findMin());
        System.out.println(bst.findMax());
        System.out.println(bst.get(0));
        System.out.println(bst.get(3));
        System.out.println(bst.get(5));


    }
}

@Getter
@ToString
class Node {
    private final int key;
    Node leftChild, rightChild;

    public Node(int key) {
        this.key = key;
    }

    public void insertToNode(int value) {
        if (value < key) {
            if (null == leftChild) {
                leftChild = new Node(value);
            } else {
                leftChild.insertToNode(value);
            }
        } else if (value > key) {
            if (null == rightChild) {
                rightChild = new Node(value);
            } else {
                rightChild.insertToNode(value);
            }
        }
    }

    public Integer findMin() {
        if (null == leftChild) {
            return key;
        } else {
            return leftChild.findMin();
        }
    }

    public Integer findMax() {
        if (null == rightChild) {
            return key;
        } else {
            return rightChild.findMax();
        }
    }

    public Node get(int value) {
        if (value == key) {
            return this;
        } else if (value < key && null != leftChild) {
            return leftChild.get(value);
        } else if (value > key && null != rightChild) {
            return rightChild.get(value);
        } else return null;
    }

    public void traverse() {
        if (null != leftChild) {
            leftChild.traverse();
        }
        System.out.println(key);
        if (null != rightChild) {
            rightChild.traverse();
        }
    }
}

@ToString
class BinarySearchTree {
    Node root;

    public void insert(int value) {
        if (null == root) {
            root = new Node(value);
        } else {
            root.insertToNode(value);
        }
    }

    public Integer findMin() {
        if (null == root) {
            return null;
        } else {
            return root.findMin();
        }
    }

    public Integer findMax() {
        if (null == root) {
            return null;
        } else {
            return root.findMax();
        }
    }

    public Node get(int value) {
        if (null != root) {
            return root.get(value);
        } else return null;
    }

    public void traverse() {
        if (null != root) {
            root.traverse();
        }
    }
}
