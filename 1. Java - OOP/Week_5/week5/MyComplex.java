package neko.oop.week5;

import static java.lang.Math.sqrt;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "MyComplex{" +
                "real=" + real +
                ", imag=" + imag +
                '}';
    }

    public boolean isReal() {
        return this.imag == 0;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public boolean isImaginary() {
        return this.real == 0;
    }

    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex another) {
        return this.equals(another.getReal(), another.getImag());
    }

    public double magnitude() {
        return sqrt((real * real) + (imag * imag));
    }

    public MyComplex add(MyComplex another) {
        this.setValue(this.getReal() + another.getReal(), this.getImag() + another.getImag());
        return this;
    }

    public MyComplex addNew(MyComplex another) {
        return new MyComplex(this.getReal() + another.getReal(), this.getImag() + another.getImag());
    }

    public MyComplex subtract(MyComplex another) {
        this.setValue(this.getReal() - another.getReal(), this.getImag() - another.getImag());
        return this;
    }

    public MyComplex subtractNew(MyComplex another) {
        return new MyComplex(this.getReal() - another.getReal(), this.getImag() - another.getImag());
    }

    public MyComplex multiply(MyComplex another) {
        this.setReal(this.getReal() * another.getReal() - this.getImag() * another.getImag());
        this.setImag(this.getReal() * another.getImag() + this.getImag() * another.getReal());
        return this;
    }

    public MyComplex divide(MyComplex another) {
        double tmp = another.getReal() * another.getReal() + another.getImag() * another.getImag();
        this.multiply(another);
        this.setValue(this.getReal() / tmp, this.getImag() / tmp);
        return this;
    }
}
