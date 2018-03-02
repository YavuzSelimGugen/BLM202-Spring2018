package LinkedList;

/**
 * @file Test.java
 * @date Mar 2, 2018 , 2:19:00 PM
 * @author Muhammet Alkan
 */
public class Test {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        System.out.println("size : " + list.size());
        list.removeWithOneTemp("4");

        list.addFirst("node1");
        list.addLast(new Node<>("node2"));
        list.addLast(new Node<>("node3"));
        list.addFirst("node4");

        list.print();
        
        list.removeWithOneTemp("5");
        list.removeWithOneTemp("node3");
        
        list.insertAfter("node2", "node5");
        list.insertAfter("node2", "node6");

        list.print();

    }
}
