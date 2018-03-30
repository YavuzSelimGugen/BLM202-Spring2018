package HashTable_LinkedList;

/**
 * @file LinkedList.java
 * @date Mar 30, 2018 , 2:09:46 PM
 * @author Muhammet Alkan
 */
public class LinkedList<T, G> {

    Node<T, G> head;

    public void addFirst(T key, G value) {
        Node<T, G> newNode = new Node<>(key, value);

        newNode.nextNode = head;
        head = newNode;
    }

    public void printList() {
        Node<T, G> temp = head;
        
        while (temp != null) {            
            System.out.print("["+temp.key + " : " + temp.value + "] -> ");
            temp = temp.nextNode;
        }
        
        System.out.println("null");
    }
}
