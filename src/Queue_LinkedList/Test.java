package Queue_LinkedList;

/**
 * @file Test.java
 * @date Mar 23, 2018 , 5:36:29 PM
 * @author Muhammet Alkan
 */
public class Test {

    public static void main(String[] args) {
        Queue<Integer> intQueue = new Queue<>();

        intQueue.enqueue(5);
        intQueue.enqueue(4);
        intQueue.enqueue(3);

        intQueue.print();
        System.out.println("size : " + intQueue.size());

        intQueue.dequeue();
        intQueue.dequeue();

        intQueue.print();
        System.out.println("size : " + intQueue.size());

        intQueue.dequeue();
        intQueue.dequeue();

        System.out.println("size : " + intQueue.size());
        intQueue.print();
    }
}
