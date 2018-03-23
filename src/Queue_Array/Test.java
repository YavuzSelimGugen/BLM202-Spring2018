package Queue_Array;

/**
 * @file Test.java
 * @date Mar 23, 2018 , 5:46:12 PM
 * @author Muhammet Alkan
 */
public class Test {

    public static void main(String[] args) {
        Queue<String> stringQueue = new Queue<>(5);

        stringQueue.enqueue("data1");
        stringQueue.enqueue("data2");
        stringQueue.enqueue("data3");
        stringQueue.enqueue("data4");
        stringQueue.enqueue("data5");
        stringQueue.enqueue("data6");   // queue is full !
        stringQueue.enqueue("data7");   // queue is full !

        stringQueue.print();
        System.out.println("size : " + stringQueue.size());

        stringQueue.dequeue();  // dequeue data1
        stringQueue.dequeue();  // dequeue data2

        stringQueue.print();
        System.out.println("size : " + stringQueue.size());

        stringQueue.enqueue("data8");

        stringQueue.print();
        System.out.println("size : " + stringQueue.size());

        stringQueue.dequeue();  // dequeue data3
        stringQueue.dequeue();  // dequeue data4

        stringQueue.print();
        System.out.println("size : " + stringQueue.size());

        stringQueue.dequeue();  // dequeue data5
        stringQueue.dequeue();  // dequeue data8

        stringQueue.print();
        System.out.println("size : " + stringQueue.size());
    }
}
