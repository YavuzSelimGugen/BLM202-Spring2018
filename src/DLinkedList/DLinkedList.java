package DLinkedList;

/**
 * @file DLinkedList.java
 * @date Mar 5, 2018 , 9:14:18 AM
 * @author Muhammet Alkan
 */
public class DLinkedList<MyType> {

    private Node<MyType> head;
    private int size;

    public void addFirst(MyType data) {
        Node<MyType> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.nextNode = head;
            head.prevNode = newNode;
            head = newNode;
        }

        size++;
    }

    public void addLast(MyType data) {
        Node<MyType> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<MyType> temp = head;

            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }

            temp.nextNode = newNode;
            newNode.prevNode = temp;
        }
        
        size++;
    }

    public boolean insertAfter(MyType iData, MyType newData) {
        Node<MyType> temp = head;

        while (temp != null && !temp.data.equals(iData)) {
            temp = temp.nextNode;
        }

        if (temp != null) {
            Node<MyType> newNode = new Node<>(newData);

            newNode.nextNode = temp.nextNode;
            newNode.prevNode = temp;
            temp.nextNode = newNode;
            newNode.nextNode.prevNode = newNode;

            size++;

            return true;
        }
        return false;
    }

    public void remove(MyType rData) {
        if (head == null) {
            System.out.println("empty list !");
        } else {
            if (head.data.equals(rData)) {
                head = head.nextNode;
                head.prevNode = null;

                size--;
            } else {
                Node<MyType> temp = head;

                while (temp != null && !temp.data.equals(rData)) {
                    temp = temp.nextNode;
                }

                if (temp != null) {
                    temp.prevNode.nextNode = temp.nextNode;
                    temp.nextNode.prevNode = temp.prevNode;

                    size--;
                } else {
                    System.out.println("item not found : " + rData);
                }
            }
        }
    }

    public int size() {
        return size;
    }

    public void print() {
        Node<MyType> temp = head;

        for (int i = 0; i < size; i++) {
            System.out.print(temp.data + " -> ");
            temp = temp.nextNode;
        }

        System.out.println("null");
    }
}
