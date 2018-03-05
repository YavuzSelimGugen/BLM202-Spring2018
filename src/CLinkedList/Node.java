package CLinkedList;

/**
 * @file Node.java
 * @date Mar 5, 2018 , 10:16:26 AM
 * @author Muhammet Alkan
 */
public class Node<AnyType> {

    AnyType data;
    Node<AnyType> nextNode;

    public Node(AnyType data) {
        this.data = data;
    }

}
