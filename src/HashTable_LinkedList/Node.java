package HashTable_LinkedList;

/**
 * @file Node.java
 * @date Mar 30, 2018 , 2:07:40 PM
 * @author Muhammet Alkan
 */
public class Node<T, G> {

    T key;
    G value;
    Node<T, G> nextNode;

    public Node(T key, G value) {
        this.key = key;
        this.value = value;
    }

}
