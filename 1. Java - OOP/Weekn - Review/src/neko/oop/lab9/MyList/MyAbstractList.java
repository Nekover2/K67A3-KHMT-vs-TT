package neko.oop.lab9.MyList;

public abstract class MyAbstractList implements MyList {
    public MyAbstractList() {

    }

    void checkBoundaries(int index, int limit) {
        if (index < 0 || index > limit) {
            throw new ArrayIndexOutOfBoundsException();
        }


    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < this.size(); i++) {
            result.append(String.format("[%s]", this.get(i).toString()));
        }
        return result.toString();
    }
}
