package hus.oop.integration;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficents;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {

        coefficents = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return coefficents[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        return coefficents;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {

        // Nếu mảng đầy thì tăng kích thước mảng lên gấp đôi.
        if(size == coefficents.length) {
            enlarge();
        }

        coefficents[size] = coefficient;
        size++;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insert(double coefficient, int index) {

        // Nếu mảng đầy thì tăng kích thước mảng lên gấp đôi.
        if(size == coefficents.length) {
            enlarge();
        }

        // Dời các phần tử từ index đến cuối mảng sang phải 1 vị trí.
        for (int i = size; i > index; i--) {
            coefficents[i] = coefficents[i - 1];
        }

        // Thêm phần tử vào vị trí index.
        coefficents[index] = coefficient;
        size++;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {

        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        coefficents[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree(){
        return size - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {

        double result = 0;
        for (int i = 0; i < size; i++) {
            result += coefficents[i] * Math.pow(x, i);
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public Polynomial derivative() {

            ArrayPolynomial result = new ArrayPolynomial();
            for (int i = 1; i < size; i++) {
                result.append(coefficents[i] * i);
            }
            return result;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {

        // Lấy độ dài của đa thức có bậc lớn hơn.
        int maxLength = Math.max(size, another.degree() + 1);

        // Tạo ArrayPolynomial mới
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < maxLength; i++) {
            result.append(0);
        }

        // Cộng từng phần tử của 2 đa thức vào đa thức mới.
        for (int i = 0; i < maxLength; i++) {
            double coefficient = 0;
            if(i < size) {
                coefficient += coefficents[i];
            }
            if(i < another.degree()) {
                coefficient += another.coefficient(i);
            }
            result.set(coefficient, i);
        }
        return result;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {

        // Lấy độ dài của đa thức có bậc lớn hơn.
        int maxLength = Math.max(size, another.degree() + 1);

        // Tạo ArrayPolynomial mới
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < maxLength; i++) {
            result.append(0);
        }

        // Trừ từng phần tử của 2 đa thức vào đa thức mới.

        for (int i = 0; i < maxLength; i++) {
            double coefficient = 0;
            if(i < size) {
                coefficient += coefficents[i];
            }
            if(i < another.degree()) {
                coefficient -= another.coefficient(i);
            }
            result.set(coefficient, i);
        }
        return result;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {

        // Tạo ArrayPolynomial mới
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0; i < size + another.degree(); i++) {
            result.append(0);
        }

        // Nhân từng phần tử của 2 đa thức vào đa thức mới.
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < another.degree(); j++) {
                double coefficient = result.coefficient(i + j) + coefficents[i] * another.coefficient(j);
                result.set(coefficient, i + j);
            }
        }
        return result;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {

        // Tạo mảng mới có kích thước gấp đôi mảng cũ.
        double[] newCoefficients = new double[coefficents.length * 2];

        // Copy các phần tử từ mảng cũ sang mảng mới.
        System.arraycopy(coefficents, 0, newCoefficients, 0, coefficents.length);

        // Thay đổi con trỏ của mảng cũ sang mảng mới.
        coefficents = newCoefficients;
    }
}
