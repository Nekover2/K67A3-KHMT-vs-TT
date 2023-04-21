package neko.oop.lab9.Polynomials;


import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {

    private final List<Double> coefficients;

    public ListPoly(double[] coefficients) {
        this.coefficients = new ArrayList<>();
        for (double coefficient : coefficients) {
            this.coefficients.add(coefficient);
        }
    }

    @Override
    public double[] coefficients() {
        double[] result = new double[degree() + 1];
        for (int i = 0; i < degree() + 1; i++) {
            result[i] = coefficients.get(i);
        }
        return result;
    }

    @Override
    public double coefficient(int i) {
        return coefficients.get(i);
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }
}
