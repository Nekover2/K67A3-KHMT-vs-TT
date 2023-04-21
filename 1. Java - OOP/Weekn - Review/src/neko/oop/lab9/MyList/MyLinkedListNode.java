package neko.oop.lab9.MyList;

public class MyLinkedListNode {
    private Object value;
    private MyLinkedListNode next;

    public MyLinkedListNode(Object value) {
        this.value = value;
    }

    public MyLinkedListNode(Object value, MyLinkedListNode next) {
        this.value = value;
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public MyLinkedListNode getNext() {
        return next;
    }

    public void setNext(MyLinkedListNode next) {
        this.next = next;
    }
}
