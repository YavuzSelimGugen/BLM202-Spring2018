package HashTable_LinkedList;

/**
 * @file HashTable.java
 * @date Mar 30, 2018 , 2:18:15 PM
 * @author Muhammet Alkan
 */
public class HashTable<T, G> {

    // Separate Chaining (Open Hashing)
    private LinkedList<T, G>[] table;

    public HashTable(int size) {
        table = new LinkedList[size];

        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList();
        }
    }

    public void put(T key, G value) {
        int hashResult = hashFunction(key);

        int index = hashResult % table.length;

        Node<T, G> temp = table[index].head;

        while (temp != null && !temp.key.equals(key)) {
            temp = temp.nextNode;
        }

        if (temp != null) {   // duplicate key, update value
            temp.value = value;
        } else {
            table[index].addFirst(key, value);
        }
    }

    public G get(T key) {
        int hashResult = hashFunction(key);
        int index = hashResult % table.length;

        Node<T, G> temp = table[index].head;

        while (temp != null && !temp.key.equals(key)) {
            temp = temp.nextNode;
        }

        if (temp != null) {
            return temp.value;
        }

        System.out.println("key \"" + key + "\" not found !");
        return null;
    }

    private int hashFunction(T key) {
        char first = String.valueOf(key).charAt(0);
        int hashValue = table.length - 1; // to store characters outside the alphabet at the last index of the array

        if (first >= 'A' && first <= 'Z') { // ASCII values from 65 to 90 (Upper)
            hashValue = first % 'A';
        } else if (first >= 'a' && first <= 'z') {  // ASCII values from 97 to 122 (Lower)
            hashValue = first % 'a';
        }

        return hashValue;
    }

    public void printTable() {
        for (int i = 0; i < table.length; i++) {
            System.out.print("[" + i + "] ");
            table[i].printList();
        }
    }

}
