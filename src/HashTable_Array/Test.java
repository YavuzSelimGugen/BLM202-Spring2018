package HashTable_Array;

/**
 * @file Test.java
 * @date Mar 30, 2018 , 5:09:19 PM
 * @author Muhammet Alkan
 */
public class Test {

    public static void main(String[] args) {
        // HashTable, creates an HashEntry array to store 3 elements
        HashTable<Integer, String> hashTable = new HashTable<>(3);
        
        // hashFunction gets first and last number of the key and returns the sum
        hashTable.put(1621221010, "Hamza Çakmak");
        // hashValue = 1 , index = 1 , no need to probe
        hashTable.put(1521221041, "İbrahim Yıldırım");
        // hashValue = 2 , index = 2 , no need to probe
        hashTable.put(1621221003, "Merve Yavuz");
        // hashValue = 4 , index = 1 , probe to index 0
        hashTable.put(1621221088, "Gülzade Karataş");
        // hashValue = 9 , index = 0 , no empty index to put 

        int key = 1521221041;
        System.out.println(key + " : " + hashTable.get(key));

        key = 152122;
        System.out.println(key + " : " + hashTable.get(key));

        System.out.println("\nContents of the Hash Table :");
        hashTable.printTable();
    }
}
