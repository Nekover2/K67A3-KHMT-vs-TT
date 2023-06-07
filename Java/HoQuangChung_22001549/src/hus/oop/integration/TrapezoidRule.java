package hus.oop.integration;

public class TrapezoidRule implements Integrator {
    private double precision;
    private int maxIterations;

    public TrapezoidRule(double precision, int maxIterations) {

        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     * @param poly
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {


        // Calculate using Trapezoid's rule

        int numOfSubIntervals = 2;
        double result = 0;
        double previousResult = 0;
        double error = 0;
        int numOfIterations = 0;

        do{
            previousResult = result;
            result = integrate(poly, lower, upper, numOfSubIntervals);
            error = Math.abs(result - previousResult) / 3;
            numOfSubIntervals *= 2;
            numOfIterations++;
        } while (error >= precision && numOfIterations <= maxIterations);

        return result;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals khoảng phân hoạch đều.
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {

            double result = 0;
            double deltaX = (upper - lower) / numOfSubIntervals;
            for (int i = 0; i < numOfSubIntervals; i++) {
                result += (poly.evaluate(lower + i * deltaX) + poly.evaluate(lower + (i + 1) * deltaX)) * deltaX / 2;
            }
            return result;
    }
}
