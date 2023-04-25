package hus.oop.midterm.statistics;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;

public class TestStatistics {

    public static String testArrayDataSet() {

        DataSet arrayDataSet = new ArrayDataSet();
        arrayDataSet.append(1);
        arrayDataSet.append(4);
        arrayDataSet.append(3);
        arrayDataSet.append(2);
        arrayDataSet.append(0);
        arrayDataSet.append(5);
        arrayDataSet.insert(3, 1);
        arrayDataSet.insert(2, 1);
        arrayDataSet.insert(0, 0);
        arrayDataSet.insert(5, 5);
        BasicStatistic statistic = new BasicStatistic();
        statistic.setDataSet(arrayDataSet);
        StringBuilder result = new StringBuilder();
        result.append("Statistic:").append(statistic.toString());
        // Delete a value at the head and the tail of the list
        arrayDataSet.remove(0);
        arrayDataSet.remove(arrayDataSet.size() - 1);
        result.append("Array after removing: ").append(arrayDataSet);
        result.append("Statistic:").append(statistic.toString());
        return result.toString();
    }


    public static String testListDataSet() {
        DataSet listDataSet = new ListDataSet();
        listDataSet.append(1);
        listDataSet.append(4);
        listDataSet.append(3);
        listDataSet.append(2);
        listDataSet.append(0);
        listDataSet.append(5);
        listDataSet.insert(3, 1);
        listDataSet.insert(2, 1);
        listDataSet.insert(0, 0);
        listDataSet.insert(5, 5);
        BasicStatistic statistic = new BasicStatistic();
        statistic.setDataSet(listDataSet);
        StringBuilder result = new StringBuilder();
        result.append("Statistic:").append(statistic.toString());
        // Delete a value at the head and the tail of the list
        listDataSet.remove(0);
        listDataSet.remove(listDataSet.size() - 1);
        result.append("List after removing: ").append(listDataSet);
        result.append("Statistic:").append(statistic.toString());
        System.out.println(result.toString());
        return result.toString();
    }

    public static void main(String[] args)  {
        /*


        I. Viết các chức năng test cho chương trình.
        Viết hàm test cho ArrayDataSet:
            1. Tạo một tập dữ liệu ít nhất 10 phần tử. Trong đó có test các chức năng:
                + Thêm phần tử vào cuối tập dữ liệu.
                + Thêm phần tử vào đầu tập dữ liệu.
            2. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
            3. Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
            4. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).

         Viết hàm test cho ListDataSet:
            1. Tạo một tập dữ liệu ít nhất 10 phần tử. Trong đó có test các chức năng:
                + Thêm phần tử vào cuối tập dữ liệu.
                + Thêm phần tử vào đầu tập dữ liệu.
            2. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
            3. Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu.
            4. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).

         II. Chạy các hàm test để test chương trình.
         Copy kết quả chạy chương trình và lưu vào file text có tên <Ten_MaSinhVien_Statistics>.txt
         (ví dụ, NguyenVanA_123456S_Statistics.txt).
         Nén các file source code và file text kết quả chạy chương trình theo định dạng .zip,
         đặt tên là <Ten_MaSinhVien_Statistics>.zip (ví dụ, NguyenVanA_123456_Statistics.zip) và nộp lên classroom.
         */
        // Write result to file
        try {
            FileWriter myWriter = new FileWriter("HoQuangChung_22001549_Statistics.txt");
            StringBuilder result = new StringBuilder();
            result.append(testArrayDataSet());
            result.append("\n=============== List data test result: ================= \n");
            result.append(testListDataSet());
            myWriter.write(result.toString());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
