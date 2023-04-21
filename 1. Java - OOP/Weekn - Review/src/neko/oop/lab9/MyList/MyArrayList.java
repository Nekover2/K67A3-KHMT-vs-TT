package neko.oop.lab9.MyList;

public class MyArrayList extends MyAbstractList {
    final private static int DEFAULT_CAPACITY = 10;
    private int size;
    private Object[] elements;

    public MyArrayList() {
        this.size = 0;
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    void enlarge() {
        Object[] newElements = new Object[this.elements.length * 2];
        System.arraycopy(this.elements, 0, newElements, 0, this.elements.length);
        this.elements = newElements;
    }

    @Override
    public void add(Object element) {
        if (this.size == this.elements.length) {
            enlarge();
        }
        this.elements[this.size] = element;
        this.size++;

    }

    @Override
    public void add(Object element, int index) {
        checkBoundaries(index, this.size + 1);
        if (this.size == this.elements.length) {
            enlarge();
        }
        System.arraycopy(this.elements, index, this.elements, index + 1, this.size - index);
        this.elements[index] = element;
        this.size++;
    }

    @Override
    public void remove(int element) {
        checkBoundaries(element, this.size);
        System.arraycopy(this.elements, element + 1, this.elements, element, this.size - element - 1);
        this.size--;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, this.size);
        return this.elements[index];
    }

}
