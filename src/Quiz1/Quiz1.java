package Quiz1;

/**
 * @file Quiz1Solution.java
 * @date Mar 9, 2018 , 6:54:55 PM
 * @author Muhammet Alkan
 */
public class Quiz1 {
    
    static DoublyLinkedList<String> dList = new DoublyLinkedList<>();
    static SinglyLinkedList<Integer> sList = new SinglyLinkedList<>();

    public static void main(String[] args) {

        dList.addLast("Ahmet");
        dList.addLast("Selin");
        dList.addLast("Abdullah");
        dList.addLast("Istanbulaa");
        dList.addLast("Karamel");

        // Ahmet -> Selin -> Abdullah -> Istanbulaa -> Karamel -> null
        dList.print();

        dList.sesliHarfBul();

        // 2 -> 2 -> 3 -> 5 -> 3 -> null
        sList.print();
    }
}
