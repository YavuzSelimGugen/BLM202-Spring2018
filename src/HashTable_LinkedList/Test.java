package HashTable_LinkedList;

/**
 * @file Test.java
 * @date Mar 30, 2018 , 2:56:58 PM
 * @author Muhammet Alkan
 */
public class Test {

    public static void main(String[] args) {
        // last slot(hashTable[26]) for the characters outside the alphabet
        HashTable<String, Integer> hashTable = new HashTable(27);

        // English alphabet is a Latin alphabet consisting of 26 letter
        hashTable.put("Muhammed Ali Bursalı", 1421231011);
        hashTable.put("Abdulsamet Eraslan", 1521221041);
        hashTable.put("Zeynep Nasıp", 1621221085);
        hashTable.put("Merve Tanrıkulu", 1421221024);
        hashTable.put("Hasan Gülbaba", 1621221012);
        hashTable.put("*", 546);

        String key = "x";
        System.out.println(key + " : " + hashTable.get(key));
        
        key = "Hasan Gülbaba";
        System.out.println(key + " : " + hashTable.get(key));

        System.out.println("\nContents of the Hash Table :");
        hashTable.printTable();
    }
}
