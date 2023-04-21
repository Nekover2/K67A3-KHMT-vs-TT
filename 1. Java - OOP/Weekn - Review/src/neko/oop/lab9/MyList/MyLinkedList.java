package neko.oop.lab9.MyList;

public class MyLinkedList extends MyAbstractList {
    private int size;
    private MyLinkedListNode head;

    public MyLinkedList() {
        this.size = 0;
        this.head = null;
    }

    private MyLinkedListNode getNode(int index) {
        checkBoundaries(index, this.size);
        MyLinkedListNode result = this.head;
        for (int i = 0; i < index; i++) {
            result = result.getNext();
        }
        return result;
    }

    @Override
    public void add(Object element, int index) {
        checkBoundaries(index, this.size + 1);
        if (index == 0) {
            this.head = new MyLinkedListNode(element, this.head);
        } else {
            MyLinkedListNode prev = getNode(index - 1);
            prev.setNext(new MyLinkedListNode(element, prev.getNext()));
        }
        this.size++;
    }

    @Override
    public void remove(int element) {
        checkBoundaries(element, this.size);
        if (element == 0) {
            this.head = this.head.getNext();
        } else {
            MyLinkedListNode prev = getNode(element - 1);
            prev.setNext(prev.getNext().getNext());
        }
        this.size--;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, this.size);
        return getNode(index).getValue();
    }

    @Override
    public void add(Object element) {
        this.add(element, this.size);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        MyLinkedListNode node = this.head;
        while (node != null) {
            result.append(node.getValue());
            result.append(" ");
            node = node.getNext();
        }
        return result.toString();
    }
}
