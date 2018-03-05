package DLinkedList;

/**
 * @file Test.java
 * @date Mar 5, 2018 , 9:57:21 AM
 * @author Muhammet Alkan
 */
public class Test {

    public static void main(String[] args) {
        DLinkedList<Integer> dList = new DLinkedList<>();

        dList.print();

        dList.addLast(12);
        dList.addLast(11);
        dList.addLast(10);
        dList.addFirst(9);

        dList.print();

        dList.insertAfter(12, 8);
        dList.insertAfter(12, 7);
        
        dList.print();
        System.out.println("size : " + dList.size());
        
        dList.remove(8);
        dList.remove(8);
        
        dList.print();
        System.out.println("size : " + dList.size());
    }
}
