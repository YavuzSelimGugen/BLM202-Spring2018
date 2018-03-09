package Quiz1;

/**
 * @file SNode.java
 * @date Mar 9, 2018 , 7:06:08 PM
 * @author Muhammet Alkan
 */
class SNode<MyType> {

    MyType data;
    SNode<MyType> nextNode;

    public SNode(MyType data) {
        this.data = data;
    }
}
