package Stack_LinkedList;

/**
 * @file Stack.java
 * @date Mar 16, 2018 , 3:12:08 PM
 * @author Muhammet Alkan
 */
public class Stack<T> {

    private Node<T> head;

    public Stack() {
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);

        newNode.nextNode = head;
        head = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("stack is empty !");
            return null;
        }

        T temp = head.data;

        head = head.nextNode;

        return temp;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("stack is empty !");
            return null;
        }

        return head.data;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("stack is empty !");
        } else {
            Node<T> temp = head;
            
            System.out.println("Stack elements are:");
            while (temp != null) {
                System.out.println(temp);
                temp = temp.nextNode;
            }
        }

    }

    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            Node<T> temp = head;
            
            int size = 0;
            while (temp != null) {
                size++;
                temp = temp.nextNode;
            }
            
            return size;
        }
    }
}
