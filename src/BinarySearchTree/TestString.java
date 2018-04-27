package BinarySearchTree;

/**
 * @file TestString.java
 * @date Apr 27, 2018 , 2:47:34 PM
 * @author Muhammet Alkan
 */
public class TestString {

    public static void main(String[] args) {
        BinarySearchTree<String> bst = new BinarySearchTree<>();
        
        bst.insertRecursive("Deri");
        bst.insertRecursive("Ali");
        bst.insertRecursive("Ahmet");
        bst.insertRecursive("Mehmet");
        bst.insertRecursive("Veli");
        bst.insertRecursive("Ders");
        bst.insertRecursive("Vefa");

        bst.preorder();
        bst.postorder();

        System.out.println("max : " + bst.findMaxRecursive());
        System.out.println("size : " + bst.sizeRecursive());
        System.out.println("full nodes : " + bst.findFullNodeCount());
    }
}
