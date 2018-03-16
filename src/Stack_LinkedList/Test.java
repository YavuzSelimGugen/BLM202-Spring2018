
package Stack_LinkedList;

/**
 * @file Test.java
 * @date Mar 16, 2018 , 3:29:16 PM
 * @author Muhammet Alkan
 */
public class Test {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        
        System.out.println("last element : " + intStack.peek());
        
        intStack.push(5);
        intStack.push(4);
        intStack.push(3);
        
        intStack.print();
        
        System.out.println("size : " + intStack.size());
    }
}
