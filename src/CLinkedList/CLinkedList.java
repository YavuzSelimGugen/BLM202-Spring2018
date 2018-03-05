package CLinkedList;

/**
 * @file CLinkedList.java
 * @date Mar 5, 2018 , 10:19:58 AM
 * @author Muhammet Alkan
 */
public class CLinkedList<AnyType> {

    private Node<AnyType> head;
    private Node<AnyType> tail;
    private int size;

    public void addFirst(AnyType data) {
        Node<AnyType> newNode = new Node<>(data);

        if (isEmpty()) {
            head = newNode;
            tail = head;
        } else {
            newNode.nextNode = head;
            head = newNode;
        }

        tail.nextNode = head;
        size++;
    }

    public void addLast(AnyType data) {
        Node<AnyType> newNode = new Node<>(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }

        tail.nextNode = head;
        size++;
    }

    public boolean insertAfter(AnyType iData, AnyType newData) {
        if (isEmpty()) {
            System.out.println("list empty !");
        } else {
            Node<AnyType> temp = head;

            do {
                if (temp.data.equals(iData)) {
                    Node<AnyType> newNode = new Node<>(newData);

                    newNode.nextNode = temp.nextNode;
                    temp.nextNode = newNode;
                    if (temp == tail) {
                        tail = newNode;
                    }

                    size++;
                    return true;
                }
                temp = temp.nextNode;

            } while (temp != head);

        }

        return false;
    }

    public void remove(AnyType rData) {
        if (head == null) {
            System.out.println("empty list !");
        } else {
            Node<AnyType> temp = head;

            if (head.data.equals(rData)) {
                head = head.nextNode;
                tail.nextNode = head;
            } else {

                for (int i = 0; i < size - 1; i++) {
                    if (temp.nextNode.data.equals(rData)) {
                        if (temp.nextNode == tail) {
                            tail = temp;
                        }
                        temp.nextNode = temp.nextNode.nextNode;

                    }

                    temp = temp.nextNode;
                }
            }
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
    
    public void print(){
        Node<AnyType> temp = head;
        
        for (int i = 0; i <= size; i++) {
            System.out.print(temp.data + " -> ");
            temp = temp.nextNode;
        }
    }
}
