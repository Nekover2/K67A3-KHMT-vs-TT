package hus.oop.midterm.mylist;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        head = null;
        size = 0;
    }

    /**
     * Lấy kích thước của list.
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        // get the node at index
        MyLinkedListNode node = getNodeByIndex(index);
        return node.getPayload();
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if(index == 0) {
            // Remove the head
            head = head.getNext();
        } else {
            // Remove the middle or the tail
            MyLinkedListNode prevNode = getNodeByIndex(index - 1);
            MyLinkedListNode node = prevNode.getNext();
            prevNode.setNext(node.getNext());
        }
        size--;
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     * @param payload
     */
    @Override
    public void append(Object payload) {
        // Append the element at the tail
        if(head == null) {
            // The list is empty
            head = new MyLinkedListNode(payload, null);
        } else {
            // The list is not empty
            MyLinkedListNode tail = getNodeByIndex(size - 1);
            tail.setNext(new MyLinkedListNode(payload, null));
        }
        size++;
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        // Insert the element at index
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if(index == 0) {
            // Insert at the head
            MyLinkedListNode node = new MyLinkedListNode(payload, head);
            head = node;
        } else {
            // Insert at the middle or the tail
            MyLinkedListNode prevNode = getNodeByIndex(index - 1);
            MyLinkedListNode node = new MyLinkedListNode(payload, prevNode.getNext());
            prevNode.setNext(node);
        }
        size++;
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     * @return
     */
    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator(head);
    }

    /**
     * Lấy node ở vị trí index.
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        MyLinkedListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }
}
