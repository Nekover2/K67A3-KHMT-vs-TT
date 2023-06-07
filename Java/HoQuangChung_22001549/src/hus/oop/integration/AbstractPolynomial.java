package hus.oop.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.coefficients().length; i++) {
            if (i == 0) {
                result.append(this.coefficients()[i]);
            } else {
                result.append(" + ").append(this.coefficients()[i]).append("x^").append(i);
            }
        }
        return result.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {

        double[] result = new double[this.coefficients().length - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = this.coefficients()[i + 1] * (i + 1);
        }
        return result;
    }
}
