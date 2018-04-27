package BinarySearchTree;

/**
 * @file TestString.java
 * @date Apr 27, 2018 , 2:47:34 PM
 * @author Muhammet Alkan
 */
public class TestString {

    public static void main(String[] args) {
        BinarySearchTree<String> bst = new BinarySearchTree<>();

        bst.insert("d");
        bst.insert("b");
        bst.insert("a");
        bst.insert("c");
        bst.insert("k");
        bst.insert("i");
        bst.insert("u");

        bst.preorder();
        bst.postorder();

        System.out.println("max : " + bst.findMaxRecursive());
        System.out.println("size : " + bst.sizeRecursive());
        System.out.println("full nodes : " + bst.findFullNodeCount());
    }
}
