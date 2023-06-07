package hus.oop.matrix;

import java.io.File;
import  java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class SquareMatrixTestDrive {
    public static void main(String[] args) {
        /* TODO
        Tạo ra 2 ma trận có cùng kích thước là một số ngẫu nhiên nằm trong đoạn [5, 10].
        Viết code thực hiện test các chức năng sau của các ma trận:
          - In ra 2 ma trận và 2 ma trận chuyển vị tương ứng.
          - In ra các đường chéo chính và đường chéo phụ của 2 ma trận.
          - In ra ma trận là ma trận tổng của 2 ma trận.
          - In ra ma trận là ma trận là hiệu của ma trận thứ nhất cho ma trận thứ 2.
          - In ra ma trận là ma trận tích của 2 ma trận.
          - In ra các số nguyên tố có trong 2 ma trận.

         Lưu kết quả chạy chương trình trên terminal vào file text và nộp cùng source code chương trình.
         File text kết quả được đặt tên như sau: <TenSinhVien_MaSinhVien_Matrix.txt> (Ví dụ, NguyenVanA_123456_Matrix.txt).
         */

        int n = (int) (Math.random() * 6 + 5);
        SquareMatrix matrix1 = new SquareMatrix(n);
        SquareMatrix matrix2 = new SquareMatrix(n);

        String fileName = "HoQuangChung_22001549_Matrix.txt";
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write("Ma tran 1: \n");
            fileWriter.write(matrix1.toString());
            fileWriter.write("Ma tran 2: \n");
            fileWriter.write(matrix2.toString());
            fileWriter.write("\n\nMa tran chuyen vi 1: \n");
            fileWriter.write(matrix1.transpose().toString());
            fileWriter.write("Ma tran chuyen vi 2: \n");
            fileWriter.write(matrix2.transpose().toString());
            fileWriter.write("\nDuong cheo chinh ma tran 1: \n");
            fileWriter.write(Arrays.toString(matrix1.principalDiagonal()));
            fileWriter.write("\nDuong cheo chinh ma tran 2: \n");
            fileWriter.write(Arrays.toString(matrix2.principalDiagonal()));
            fileWriter.write("\n\nDuong cheo phu ma tran 1: \n");
            fileWriter.write(Arrays.toString(matrix1.secondaryDiagonal()));
            fileWriter.write("\nDuong cheo phu ma tran 2: \n");
            fileWriter.write(Arrays.toString(matrix2.secondaryDiagonal()));
            fileWriter.write("\nTong 2 ma tran: \n");
            fileWriter.write(matrix1.add(matrix2).toString());
            fileWriter.write("\nHieu 2 ma tran: \n");
            fileWriter.write(matrix1.minus(matrix2).toString());
            fileWriter.write("\nTich 2 ma tran: \n");
            fileWriter.write(matrix1.multiply(matrix2).toString());
            fileWriter.write("\nSo nguyen to trong ma tran 1: \n");
            fileWriter.write(Arrays.toString(matrix1.primes()));
            fileWriter.write("\nSo nguyen to trong ma tran 2: \n");
            fileWriter.write(Arrays.toString(matrix2.primes()));
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
