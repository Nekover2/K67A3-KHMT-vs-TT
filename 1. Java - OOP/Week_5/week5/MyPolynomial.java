package neko.oop.week5;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public double getCurrentDegreeValue(int degree) {
        if(degree > this.getDegree()) return 0;
        return coeffs[degree];
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = coeffs.length - 1; i >= 0; i--) {
            result += coeffs[i] + "*x^" + i;
            if(i != 0) result += " + ";
        }
        return result;
    }

    public double evaluate(double value) {
        if (coeffs.length == 0 ) return 0;
        double result = coeffs[0];
        for (int i = 1; i < coeffs.length - 1; i++) {
            result += value * coeffs[i];
            value *= value;
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = this.getDegree();
        if(right.getDegree() > this.getDegree()) maxDegree = right.getDegree();
        double[] result = new double[maxDegree+1];
        for (int i = 0; i <= maxDegree; i++) {
            result[i] = this.getCurrentDegreeValue(i) + right.getCurrentDegreeValue(i);
        }
        return new MyPolynomial(result);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int maxDegree = this.getDegree() + right.getDegree();
        double[] tmp = new double[maxDegree+1];
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                tmp[i + j] += this.getCurrentDegreeValue(i) * right.getCurrentDegreeValue(j);
            }
        }
        return new MyPolynomial(tmp);
    }
}
