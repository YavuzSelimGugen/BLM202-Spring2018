package Quiz1;

/**
 * @file SinglyLinkedList.java
 * @date Mar 9, 2018 , 7:05:36 PM
 * @author Muhammet Alkan
 */
public class SinglyLinkedList<MyType> {

    SNode<MyType> head;
    SNode<MyType> tail;

    public void addLast(MyType data) {
        SNode<MyType> newNode = new SNode<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
    }

    // not included in the quiz
    public void print() {
        SNode<MyType> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.nextNode;
        }

        System.out.println("null");
    }
}
