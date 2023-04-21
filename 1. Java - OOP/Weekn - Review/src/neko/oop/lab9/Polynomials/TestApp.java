package neko.oop.lab9.Polynomials;

public class TestApp {
    public static void main(String[] args) {
        Poly ap = new ArrayPoly(new double[]{1, 3, 4, 8});
        Poly lp = new ListPoly(new double[]{1, 3, 4, 8});

        System.out.println("ap = " + ap.derivative());
        System.out.println("lp = " + lp.derivative());

        if ((ap).equals(lp)) {
            System.out.println("ap and lp are equal");
        } else {
            System.out.println("ap and lp are not equal");
        }
    }
}
