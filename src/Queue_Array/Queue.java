package Queue_Array;

/**
 * @file Queue.java
 * @date Mar 23, 2018 , 3:43:15 PM
 * @author Muhammet Alkan
 */
public class Queue<T> {

    private T[] dataArray;

    private int front, rear;
    private int size;   // number of elements in the queue

    public Queue(int maxCapacity) {
        dataArray = (T[]) new Object[maxCapacity];
    }

    public void enqueue(T newData) {
        if (isFull()) {
            System.out.println("queue is full !");
        } else {
            dataArray[rear] = newData;
            rear++;

            if (rear % dataArray.length == 0) {
                rear = 0;
            }

            size++;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty !");
            return null;
        } else {
            T removedData = dataArray[front];
            front++;

            if (front % dataArray.length == 0) {
                front = 0;
            }

            size--;

            return removedData;
        }
    }

    private boolean isFull() {
        return size == dataArray.length;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("queue is empty !");
        } else {

            int start = front;
            for (int i = 0; i < size; i++) {
                System.out.print(dataArray[start] + " -> ");

                start++;
                if (start % dataArray.length == 0) {
                    start = 0;
                }
            }
            System.out.println("null");
        }

    }

    public int size() {
        return size;
    }
}
