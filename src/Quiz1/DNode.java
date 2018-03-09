package Quiz1;

/**
 * @file DNode.java
 * @date Mar 9, 2018 , 7:10:28 PM
 * @author Muhammet Alkan
 */
class DNode<MyType> {

    MyType data;
    DNode<MyType> nextNode;
    DNode<MyType> prevNode;

    public DNode(MyType data) {
        this.data = data;
    }
}
