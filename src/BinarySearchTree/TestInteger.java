package BinarySearchTree;

/**
 * @file TestInteger.java
 * @date Apr 27, 2018 , 2:44:45 PM
 * @author Muhammet Alkan
 */
public class TestInteger {

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        System.out.println("max : " + bst.findMaxRecursive());

        bst.insertRecursive(7);
        bst.insertRecursive(4);
        bst.insertRecursive(10);
        bst.insertRecursive(5);
        bst.insertRecursive(8);

        System.out.println("max : " + bst.findMaxRecursive());

        bst.insertRecursive(15);
        bst.insertRecursive(12);
        bst.insertRecursive(12);

        System.out.println("max : " + bst.findMaxRecursive());
        System.out.println("size : " + bst.sizeRecursive());
        System.out.println("full nodes : " + bst.findFullNodeCount());

        bst.preorder();
        bst.postorder();
    }
}
