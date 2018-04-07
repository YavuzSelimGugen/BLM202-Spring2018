package HashTable_Array;

/**
 * @file HashEntry.java
 * @date Mar 30, 2018 , 4:43:38 PM
 * @author Muhammet Alkan
 */
public class HashEntry<T, G> {

    T key;
    G value;

    public HashEntry(T key, G value) {
        this.key = key;
        this.value = value;
    }
}
