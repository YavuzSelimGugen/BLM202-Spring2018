package LinkedList;

/**
 * @file LinkedList.java
 * @date Mar 2, 2018 , 2:22:49 PM
 * @author Muhammet Alkan
 */
public class LinkedList<AnyType> {

    Node<AnyType> head;

    public LinkedList() {
        head = null;
    }

    public void addFirst(AnyType newData) {
        addFirst(new Node<AnyType>(newData));
    }

    public void addFirst(Node<AnyType> newNode) {
        newNode.nextNode = head;
        head = newNode;
    }

    public void addLast(Node<AnyType> newNode) {
        if (head == null) {
            head = newNode; // addFirst(newNode);
        } else {
            Node<AnyType> temp = head;

            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }

            temp.nextNode = newNode;
        }
    }

    public boolean insertAfter(AnyType iData, AnyType newData) {
        Node<AnyType> temp = head;

        while (temp != null && !temp.data.equals(iData)) {
            temp = temp.nextNode;
        }

        if (temp != null) {
            Node<AnyType> newNode = new Node<>(newData);

            newNode.nextNode = temp.nextNode;
            temp.nextNode = newNode;
            return true;
        }
        return false;
    }

    public void remove(AnyType rData) {
        if (head == null) {
            System.out.println("empty list !");
        } else {
            if (head.data.equals(rData)) {
                head = head.nextNode;
            } else {
                Node<AnyType> temp = head;
                Node<AnyType> prev = null;

                while (temp != null && !temp.data.equals(rData)) {
                    prev = temp;
                    temp = temp.nextNode;
                }

                if (temp != null) {
                    prev.nextNode = temp.nextNode;
                } else {
                    System.out.println("item not found :" + rData);
                }
            }
        }

    }

    public void removeWithOneTemp(AnyType rData) {
        if (head == null) {
            System.out.println("empty list !");
        } else {
            if (head.data.equals(rData)) {
                head = head.nextNode;
            } else {
                Node<AnyType> temp = head;

                while (temp.nextNode != null && !temp.nextNode.data.equals(rData)) {
                    temp = temp.nextNode;
                }

                if (temp.nextNode != null) {
                    temp.nextNode = temp.nextNode.nextNode;
                } else {
                    System.out.println("item not found :" + rData);
                }
            }
        }

    }

    public boolean isEmpty() {
        return (head == null);
    }

    public int size() {
        int counter = 0;

        Node<AnyType> temp = head;

        while (temp != null) {
            counter++;
            temp = temp.nextNode;
        }

        return counter;
    }

    public void print() {
        Node<AnyType> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.nextNode;
        }
        
        System.out.println("null");
    }

}
