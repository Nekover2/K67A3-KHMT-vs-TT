package hus.oop.midterm.statistics;

public class ArrayDataSet extends AbstractDataSet {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] data;
    private int size;

    /**
     * Hàm dựng để khởi tạo dữ liệu.
     */
    public ArrayDataSet() {
        data = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public double element(int index) {
        return this.data[index];
    }

    @Override
    public double[] elements(int from, int to) {
        if(from < 0 || to >= size || from > to) throw new IndexOutOfBoundsException();
        double[] res = new double[to - from + 1];
        if (to + 1 - from >= 0) System.arraycopy(this.data, from, res, 0, to + 1 - from);
        return res;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void append(double value) {
        //Check if array is full, if full, locate more
        if (size == data.length) enlarge();
        //Add value to array
        data[size++] = value;
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     * @param value
     * @param index
     */
    @Override
    public void insert(double value, int index) {
        if(index < 0 || index > size) throw new IndexOutOfBoundsException();
        //Check if array is full, if full, locate more
        if (size == data.length) enlarge();
        //Move all elements after index to right
        System.arraycopy(data, index, data, index + 1, size - index);
        //Add value to array
        data[index] = value;
        size++;
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        if(index < 0 || index >= size) throw new IndexOutOfBoundsException();
        //Move all elements after index to left
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
    }

    /**
     * Xóa tất cả các phần tử dữ liệu có giá trị bằng value.
     * @param value
     */
    @Override
    public void remove(double value) {
        int i = 0;
        while (i < size) {
            if (data[i] == value) {
                remove(i);
            } else {
                i++;
            }
        }
    }

    /**
     * Mở rộng gấp đôi kích thước mảng nếu hết chỗ để chứa dữ liệu.
     */
    private void enlarge() {
        //Create new array with double size
        //Copy all elements from old array to new array
        //Assign new array to old array
        double[] newData = new double[this.data.length * 2];
        System.arraycopy(this.data, 0, newData, 0, this.data.length);
        this.data = newData;
    }
}
