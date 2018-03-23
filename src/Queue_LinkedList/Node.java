package Queue_LinkedList;

/**
 * @file Node.java
 * @date Mar 23, 2018 , 3:31:19 PM
 * @author Muhammet Alkan
 */
public class Node<T> {

    T data;
    Node<T> nextNode;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data + "";
    }
}
