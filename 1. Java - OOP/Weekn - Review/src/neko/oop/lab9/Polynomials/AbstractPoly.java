package neko.oop.lab9.Polynomials;

import java.util.Arrays;
import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    public AbstractPoly() {
    }

    double[] derive() {
        double[] result = new double[degree()];
        for (int i = 0; i < degree(); i++) {
            result[i] = coefficient(i + 1) * (i + 1);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //When check class, it returns false ? Shouldn't it return true?
        //if (o == null || getClass() != o.getClass()) return false;
        AbstractPoly self = (AbstractPoly) this;
        AbstractPoly that = (AbstractPoly) o;
        return self.degree() == that.degree() && Arrays.equals(self.coefficients(), that.coefficients());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = degree(); i >= 0; i--) {
            if (coefficient(i) != 0) {
                if (coefficient(i) > 0 && i != degree()) {
                    result.append(" + ");
                }
                //if (coefficient(i) != 1 && coefficient(i) != -1) {
                result.append(coefficient(i));
                //}
                if (coefficient(i) == -1) {
                    result.append("-");
                }
                if (i != 0) {
                    result.append("x");
                }
                if (i > 1) {
                    result.append("^").append(i);
                }
            }
        }
        return result.toString();
    }
}
