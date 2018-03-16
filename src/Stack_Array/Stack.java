package Stack_Array;

/**
 * @file Stack.java
 * @date Mar 16, 2018 , 2:14:38 PM
 * @author Muhammet Alkan
 */
public class Stack<T> {

    private T[] dataArray;
    private int top;

    public Stack(int maxSize) {
        dataArray = (T[]) new Object[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(T data) {
        if (top == dataArray.length - 1) {
            System.out.println("stack is full !");
        } else {
            // top++;
            dataArray[++top] = data;
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("stack is empty !");
            return null;
        } else {
            //T temp = dataArray[top];
            //top--;
            //return temp;
            return dataArray[top--];
        }
    }

    public int size() {
        return top + 1;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("stack is empty !");
        } else {
            System.out.println("Stack elements are:");
            for (int i = 0; i <= top; i++) {
                System.out.println(dataArray[i]);
            }
        }
    }

}
