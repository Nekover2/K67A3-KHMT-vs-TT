package neko.oop.lab9.Polynomials;

public interface Poly {
    double[] coefficients();

    double coefficient(int i);

    int degree();

    Poly derivative();
}
