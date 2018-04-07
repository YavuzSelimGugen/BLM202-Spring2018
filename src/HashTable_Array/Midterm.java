package HashTable_Array;

/**
 * @file Midterm.java
 * @date Apr 4, 2018 , 4:06:37 PM
 * @author Muhammet Alkan
 */
public class Midterm {

    public static void main(String[] args) {
        HashTable<Integer, Character> hashTable = new HashTable<>(10);

        hashTable.put(213, 'a');
        hashTable.put(21452, 'b');
        hashTable.put(324232, 'c');
        hashTable.put(12, 'd');
        hashTable.put(21, 'e');
        hashTable.put(325, 'f');
        hashTable.put(324, 'g');
        hashTable.put(46, 'h');
        hashTable.put(98, 'i');
        hashTable.put(786, 'j');
        hashTable.put(567997, 'k');
        hashTable.put(98986, 'l');
        hashTable.put(21452, 'm');

        hashTable.printTable();
    }
}
