package HashTable_Array;

/**
 * @file HashTable.java
 * @date Mar 30, 2018 , 4:43:17 PM
 * @author Muhammet Alkan
 */
public class HashTable<T, G> {
    // Linear Probing (Closed Hashing)
    private HashEntry<T, G>[] table;

    public HashTable(int size) {
        table = new HashEntry[size];
    }

    public void put(T key, G value) {
        int hashResult = hashFunction(key);
        int index = hashResult % table.length;

        if (table[index] == null) { // null index, insert new entry
            table[index] = new HashEntry<>(key, value);
        } else if (table[index].key.equals(key)) {  // duplicate key, update value
            table[index].value = value;
        } else { // search for an empty index by using linear probing, lookup for the next indexes
            int tempIndex = (index + 1) % table.length;

            // loop until traverse all indexes of the array
            while (tempIndex != index) {
                if (table[tempIndex] == null) { // null index, insert new entry
                    table[tempIndex] = new HashEntry<>(key, value);
                    return;
                } else if (table[tempIndex].key.equals(key)) {  // duplicate key, update value
                    table[tempIndex].value = value;
                    return;
                }
                tempIndex = (tempIndex + 1) % table.length;
            }
            System.out.println("no empty index to put [" + key + " : " + value + "]");
        }
    }

    public G get(T key) {
        int hashResult = hashFunction(key);
        int index = hashResult % table.length;

        if (table[index] != null && table[index].key.equals(key)) {
            return table[index].value;
        }

        System.out.println("key \"" + key + "\" not found !");
        return null;
    }

    private int hashFunction(T key) {
        String temp = String.valueOf(key);
        int first = Integer.parseInt(temp.charAt(0) + "");
        int last = Integer.parseInt(temp.charAt(temp.length() - 1) + "");
        
        return first + last;
    }

    public void printTable() {

        for (int i = 0; i < table.length; i++) {
            System.out.print("[" + i + "] ");
            if (table[i] != null) {
                System.out.println("[" + table[i].key + " : " + table[i].value + "] ");
            } else {
                System.out.println("null");
            }
        }
    }
}
