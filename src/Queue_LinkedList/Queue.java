package Queue_LinkedList;

/**
 * @file Queue.java
 * @date Mar 23, 2018 , 3:31:58 PM
 * @author Muhammet Alkan
 */
public class Queue<T> {

    private Node<T> front, rear;

    public void enqueue(T newData) {
        Node<T> newNode = new Node<>(newData);

        if (isEmpty()) {
            // if queue is empty, then newNode is front and rear both
            front = rear = newNode;
        } else {
            rear.nextNode = newNode;
            rear = newNode;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty !");
            return null;
        } else {
            T returnData = front.data;

            front = front.nextNode;

            // in case it was the last element, set rear as null
            if (isEmpty()) {
                rear = null;
            }

            return returnData;
        }
    }

    private boolean isEmpty() {
        return front == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("queue is empty !");
        } else {
            Node<T> temp = front;

            while (temp != null) {
                System.out.print(temp + " -> ");
                temp = temp.nextNode;
            }
            System.out.println("null");
        }

    }

    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            Node<T> temp = front;

            int size = 0;
            while (temp != null) {
                size++;
                temp = temp.nextNode;
            }

            return size;
        }
    }
}
