package neko.oop.lab9.MyList;

public interface MyList {
    void add(Object element, int index);

    void remove(int element);

    int size();

    Object get(int index);

    void add(Object element);
}
