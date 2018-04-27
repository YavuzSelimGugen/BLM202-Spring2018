package BinarySearchTree;

/**
 * @file BinarySearchTree.java
 * @date Apr 27, 2018 , 2:06:48 PM
 * @author Muhammet Alkan
 */
public class BinarySearchTree<T extends Comparable<T>> {

    private Node<T> root;

    void insertRecursive(T newData) {
        root = insertRecursive(root, newData);
    }

    private Node<T> insertRecursive(Node<T> n, T newData) {
        if (n == null) {
            n = new Node<>(newData);
        } else {
            if (newData.compareTo(n.data) > 0) {
                n.rightChild = insertRecursive(n.rightChild, newData);
            } else if (newData.compareTo(n.data) < 0) {
                n.leftChild = insertRecursive(n.leftChild, newData);
            }
        }

        return n;
    }

    // iterative insert, it compares objects by looking the hashCode value !!
    void insert(T newData) {
        Node<T> newNode = new Node<>(newData);

        if (root == null) {
            root = newNode;
        } else {
            Node<T> temp = root;
            Node<T> parent;

            while (temp != null) {
                parent = temp;

                if (newData.hashCode() > temp.data.hashCode()) {
                    temp = temp.rightChild;
                    if (temp == null) {
                        parent.rightChild = newNode;
                    }
                } else if (newData.hashCode() < temp.data.hashCode()) {
                    temp = temp.leftChild;
                    if (temp == null) {
                        parent.leftChild = newNode;
                    }
                } else {
                    temp = null;
                }
            }
        }
    }

    void preorder() {
        System.out.print("preorder :  ");
        preorder(root);
        System.out.println();
    }

    private void preorder(Node<T> n) {
        if (n != null) {
            System.out.print(n.data + " ");
            preorder(n.leftChild);
            preorder(n.rightChild);
        }
    }

    void postorder() {
        System.out.print("postorder :  ");
        postorder(root);
        System.out.println();
    }

    private void postorder(Node<T> n) {
        if (n != null) {
            postorder(n.leftChild);
            postorder(n.rightChild);
            System.out.print(n.data + " ");
        }
    }

    T findMaxRecursive() {
        if (root == null) {
            System.err.println("empty BST !");
            return null;
        }

        return findMaxRecursive(root);
    }

    private T findMaxRecursive(Node<T> n) {
        if (n.rightChild != null) {
            return findMaxRecursive(n.rightChild);
        }
        return n.data;
    }

    int sizeRecursive() {
        return sizeRecursive(root);
    }

    private int sizeRecursive(Node<T> n) {
        if (n == null) {
            return 0;
        } else {
            return 1 + sizeRecursive(n.rightChild) + sizeRecursive(n.leftChild);
        }
    }

    int findFullNodeCount() {
        return findFullNodeCount(root);
    }

    private int findFullNodeCount(Node<T> n) {
        if (n == null) {
            return 0;
        } else {
            if (n.rightChild != null && n.leftChild != null) {
                return 1 + findFullNodeCount(n.rightChild) + findFullNodeCount(n.leftChild);
            } else {
                return 0 + findFullNodeCount(n.rightChild) + findFullNodeCount(n.leftChild);
            }
        }
    }

    // Homework - try to write given recursive methods
    // The height of a tree is the length of the path from the root to the 
    // deepest node in the tree. A tree with only a node (the root) has a height of zero
    int findHeightRecursive() {
        return findHeightRecursive(root);
    }

    private int findHeightRecursive(Node<T> n) {

    }

    // Write a recursive method to find sum of all elements in the binary search tree.
    int findSumRecursive() {
        return findSumRecursive(root);
    }

    private int findSumRecursive(Node<T> n) {

    }

    // Write a recursive method which returns true 
    // if the given element is found in the binary search tree.
    boolean containsRecursive(T searchData) {
        return containsRecursive(root, searchData);
    }

    private boolean containsRecursive(Node<T> n, T searchData) {

    }

}
