package BinarySearchTree;

/**
 * @file Node.java
 * @date Apr 27, 2018 , 2:05:05 PM
 * @author Muhammet Alkan
 */
public class Node<T extends Comparable<T>> {

    T data;
    Node<T> leftChild;
    Node<T> rightChild;

    public Node(T data) {
        this.data = data;
    }
}
