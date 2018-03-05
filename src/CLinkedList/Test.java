
package CLinkedList;

/**
 * @file Test.java
 * @date Mar 5, 2018 , 11:16:13 AM
 * @author Muhammet Alkan
 */
public class Test {
    public static void main(String[] args) {
        CLinkedList<String> cList = new CLinkedList<>();
        
        cList.addLast("node1");
        cList.insertAfter("node1", "node2");
        
        cList.print();

        cList.addFirst("node3");
        
        cList.print();
    }
}
