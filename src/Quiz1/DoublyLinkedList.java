package Quiz1;

/**
 * @file DoublyLinkedList.java
 * @date Mar 9, 2018 , 7:10:14 PM
 * @author Muhammet Alkan
 */
public class DoublyLinkedList<MyType> {

    // not included in the quiz
    DNode<MyType> head, tail;

    void sesliHarfBul() {
        String sesliHarfler = "aeıioöuüAEIİOÖUÜ";

        DNode<MyType> temp = head;

        while (temp != null) {
            String data = (String) temp.data;

            int sesliHarfSayisi = 0;
            for (int i = 0; i < data.length(); i++) {
                if (sesliHarfler.indexOf(data.charAt(i)) != -1) {
                    sesliHarfSayisi++;
                }
            }

            Quiz1.sList.addLast(sesliHarfSayisi);

            temp = temp.nextNode;
        }
    }

    public void addLast(MyType data) {
        DNode<MyType> newNode = new DNode<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
    }

    // not included in the quiz
    public void print() {
        DNode<MyType> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.nextNode;
        }

        System.out.println("null");
    }
}
