package hus.oop.integration;
import java.io.FileWriter;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
           (ví dụ, NguyenVanA_123456_Integration.txt)
         - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        String fileName = "HoQuangChung_22001549_Integration.txt";
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("Test ArrayPolynomial\n");
            fileWriter.write(testArrayPolynomial());
            fileWriter.write("Test ListPolynomial\n");
            fileWriter.write(testListPolynomial());
            fileWriter.write("Test ArrayPolynomialCalculator\n");
            fileWriter.write(testIntegrationCalculator());
            fileWriter.close();

            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String testArrayPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */

        String result = "";

        ArrayPolynomial arrayPolynomial = new ArrayPolynomial();
        arrayPolynomial.append(1).append(2).append(3).append(4).append(5);
        result += "ArrayPolynomial: " + arrayPolynomial.toString() + "\n";
        arrayPolynomial.set(6, 0);
        result += "ArrayPolynomial after set 1st element to 6 : " + arrayPolynomial.toString() + "\n";
        arrayPolynomial.insert(7, 2);
        result += "ArrayPolynomial after insert 7 to 2nd element : " + arrayPolynomial.toString() + "\n";
        result += "ArrayPolynomial degree : " + arrayPolynomial.degree() + "\n";
        result += "ArrayPolynomial evaluate at 2 : " + arrayPolynomial.evaluate(2) + "\n";

        ArrayPolynomial arrayPolynomial2 = new ArrayPolynomial();
        arrayPolynomial2.append(1).append(2).append(3).append(4).append(5);
        result += "ArrayPolynomial2: " + arrayPolynomial2.toString() + "\n";
        result += "ArrayPolynomial + ArrayPolynomial2 : " + arrayPolynomial.plus(arrayPolynomial2).toString() + "\n";
        result += "ArrayPolynomial - ArrayPolynomial2 : " + arrayPolynomial.minus(arrayPolynomial2).toString() + "\n";
        result += "ArrayPolynomial * ArrayPolynomial2 : " + arrayPolynomial.multiply(arrayPolynomial2).toString() + "\n";

        return result;
    }

    public static String testListPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        String result = "";

        ListPolynomial listPolynomial = new ListPolynomial();
        listPolynomial.append(1).append(2).append(3).append(4).append(5);
        result += "ListPolynomial: " + listPolynomial.toString() + "\n";
        listPolynomial.set(6, 0);
        result += "ListPolynomial after set 1st element to 6 : " + listPolynomial.toString() + "\n";
        listPolynomial.insert(7, 2);
        result += "ListPolynomial after insert 7 to 2nd element : " + listPolynomial.toString() + "\n";
        result += "ListPolynomial degree : " + listPolynomial.degree() + "\n";
        result += "ListPolynomial evaluate at 2 : " + listPolynomial.evaluate(2) + "\n";

        ListPolynomial listPolynomial2 = new ListPolynomial();
        listPolynomial2.append(1).append(2).append(3).append(4).append(5);
        result += "ListPolynomial2: " + listPolynomial2.toString() + "\n";
        result += "ListPolynomial + ListPolynomial2 : " + listPolynomial.plus(listPolynomial2).toString() + "\n";
        result += "ListPolynomial - ListPolynomial2 : " + listPolynomial.minus(listPolynomial2).toString() + "\n";
        result += "ListPolynomial * ListPolynomial2 : " + listPolynomial.multiply(listPolynomial2).toString() + "\n";

        return result;
    }

    public static String testIntegrationCalculator() {
        /*
         TODO

         - Tạo một đa thức.
         - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
           IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời gian chạy chương trình.
         - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */

        // Tạo một đa thức
        Polynomial arrayPolynomial = new ArrayPolynomial();
        ((ArrayPolynomial) arrayPolynomial).append(1).append(2).append(3).append(4).append(5);
        System.out.println("ArrayPolynomial: " + arrayPolynomial.toString());

        // Itegrator instance

        SimpsonRule simpsonRule = new SimpsonRule(2, 100);
        MidpointRule midpointRule = new MidpointRule(2, 100);
        TrapezoidRule trapezoidRule = new TrapezoidRule(2, 100);

        // IntegrationCalculator instance

        IntegrationCalculator integrationCalculator1 = new IntegrationCalculator(simpsonRule, arrayPolynomial);
        IntegrationCalculator integrationCalculator2 = new IntegrationCalculator(midpointRule, arrayPolynomial);
        IntegrationCalculator integrationCalculator3 = new IntegrationCalculator(trapezoidRule, arrayPolynomial);

        String result = "";
        result += "SimpsonRule: " + integrationCalculator1.integrate(12, 20) + "\n";
        result += "MidpointRule: " + integrationCalculator2.integrate(12, 20) + "\n";
        result += "TrapezoidRule: " + integrationCalculator3.integrate(12, 20) + "\n";

        return result;

    }
}
