package LinkedList;

/**
 * @file Node.java
 * @date Mar 2, 2018 , 2:13:56 PM
 * @author Muhammet Alkan
 */
public class Node<AnyType> {
    AnyType data;
    Node<AnyType> nextNode;

    public Node(AnyType data) {
        this.data = data;
    }
    
    
}
