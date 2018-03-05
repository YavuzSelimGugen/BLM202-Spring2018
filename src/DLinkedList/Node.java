package DLinkedList;

/**
 * @file Node.java
 * @date Mar 5, 2018 , 9:11:56 AM
 * @author Muhammet Alkan
 */
public class Node<MyType> {
    MyType data;
    Node<MyType> nextNode;
    Node<MyType> prevNode;

    public Node(MyType data) {
        this.data = data;
    }
}
