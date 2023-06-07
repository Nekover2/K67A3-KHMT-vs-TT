package hus.oop.matrix;

public class SquareMatrix {
    private int[][] data;

    /**
     * Hàm dựng, khởi tạo một ma trận có các phần tử được sinh ngẫu nhiên trong khoảng [1, 100]
     * @param {integer} size
     */
    public SquareMatrix(int size) {
        initRandom(size);
    }

    /**
     * Phương thức khởi tạo ma trận, các phần tử của ma trận được sinh ngẫu nhiên trong khoảng [1, 100]
     * @param size
     */
    private void initRandom(int size) {
        /* TODO */
        // init data
        data = new int[size][size];
        // create size x size matrix by random values in range [1, 100]
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                // random num
                int num = (int) (Math.random() * 100 + 1);
                // set value
                data[i][j] = num;
            }
        }
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo chính của ma trận.
     * @return đường chéo chính của ma trận.
     */
    public int[] principalDiagonal() {
        /* TODO */
        // init array
        int[] arr = new int[data.length];
        // get principal diagonal
        for(int i = 0; i < data.length; i++) {
            arr[i] = data[i][i];
        }
        // return
        return arr;
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo phụ của ma trận.
     * @return đường chéo phụ của ma trận.
     */
    public int[] secondaryDiagonal() {

        /* TODO */
        // init array
        int[] arr = new int[data.length];
        // get secondary diagonal
        for(int i = 0; i < data.length; i++) {
            arr[i] = data[i][data.length - 1 - i];
        }
        // return
        return arr;
    }


    // check prime
    private boolean isPrime(int num) {
        // check
        if(num < 2) return false;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    /**
     * Phương thức lấy ra các số là số nguyên tố trong ma trận.
     * @return các số nguyên tố trong ma trận.
     */
    public int[] primes() {

        /* TODO */
        // init array
        int[] arr = new int[data.length * data.length];
        // get primes
        int index = 0;
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data.length; j++) {
                if(isPrime(data[i][j])) {
                    arr[index] = data[i][j];
                    index++;
                }
            }
        }
        // cut array
        int[] newArr = new int[index];
        for(int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        // return
        return newArr;
    }

    /**
     * Phương thức sắp xếp các phần tử của ma trận theo thứ tự tăng dần.
     * @return ma trận có các phần tử là phần tử của ma trận ban đầu được sắp xếp theo thứ tự tăng dần.
     * Các phần tử được sắp xếp theo thứ tự từ trái sang phải ở mỗi hàng, và từ trên xuống dưới.
     */
    public SquareMatrix getSortedMatrix() {
        /* TODO */
        // init array
        int[] arr = new int[data.length * data.length];
        // get all elements
        int index = 0;
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data.length; j++) {
                arr[index] = data[i][j];
                index++;
            }
        }
        // sort
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        // set value
        index = 0;
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data.length; j++) {
                data[i][j] = arr[index];
                index++;
            }
        }
        // return
        return this;
    }

    /**
     * Lấy giá trị phần tử ở vị trí (row, col).
     * @param row
     * @param col
     * @return
     */
    public int get(int row, int col) {

        // return
        return data[row][col];
    }

    /**
     * Sửa giá trị phần tử ở vị trí (row, col) thành value.
     * @param row
     * @param col
     * @param value
     */
    public void set(int row, int col, int value) {
            // set value
            data[row][col] = value;
    }

    /**
     * Phương thức cộng ma trận hiện tại với một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận tổng của 2 ma trận.
     */
    public SquareMatrix add(SquareMatrix that) {

        //return a new matrix
        SquareMatrix result = new SquareMatrix(data.length);
        // add
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++)
                result.set(i, j, data[i][j] + that.get(i, j)); ;
        }
        // return
        return result;
    }

    /**
     * Phương thức trừ ma trận hiện tại cho một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận hiệu của ma trận hiện tại và ma trận truyền vào.
     */
    public SquareMatrix minus(SquareMatrix that) {
        //return a new matrix
        SquareMatrix result = new SquareMatrix(data.length);
        // minus
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++)
                result.set(i, j, data[i][j] - that.get(i, j)); ;
        }
        // return
        return result;
    }

    /**
     * Phương thức nhân ma trận hiện tại với một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận nhân của ma trận hiện tại với ma trận truyền vào.
     */
    public SquareMatrix multiply(SquareMatrix that) {
        //return a new matrix
        SquareMatrix result = new SquareMatrix(data.length);
        // multiply
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++)
                for (int k = 0; k < data.length; k++)
                    result.set(i, j, result.get(i, j) + data[i][k] * that.get(k, j));
        }
        // return
        return result;
    }

    /**
     * Phương thức nhân ma trận với một số vô hướng.
     * @param value
     * @return ma trận mới là ma trận hiện tại được nhân với một số vô hướng.
     */
    public SquareMatrix scaled(int value) {
        //return a new matrix
        SquareMatrix result = new SquareMatrix(data.length);
        // scaled
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++)
                result.set(i, j, data[i][j] * value);
        }
        // return
        return result;
    }

    /**
     * Phương thức lấy ma trận chuyển vị.
     * @return ma trận mới là ma trận chuyển vị của ma trận hiện tại.
     */
    public SquareMatrix transpose() {
        //return a new matrix
        SquareMatrix result = new SquareMatrix(data.length);
        // transpose
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++)
                result.set(i, j, data[j][i]);
        }
        // return
        return result;
    }

    /**
     * Mô tả ma trận theo định dạng biểu diễn ma trận, ví dụ
     *   1 2 3
     *   4 5 6
     *   7 8 9
     * @return một chuỗi mô tả ma trận.
     */
    @Override
    public String toString() {
        /* TODO */
        // init string
        String result = "";
        // add value
        for(int i = 0; i < data.length; i++) {
            result += "[ ";
            for(int j = 0; j < data.length; j++)
                result += data[i][j] + " ";
            result += "]\n";
        }
        return result;
    }
}
