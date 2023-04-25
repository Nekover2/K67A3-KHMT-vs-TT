package hus.oop.midterm.mylist;

import java.io.FileWriter;
import java.io.IOException;

public class TestMyList {
    public static void main(String[] args) {
        /*
         * Chạy demo các hàm test.
         * Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
         * (ví dụ, NguyenVanA_123456_MyList.txt)
         */

        try {
            FileWriter myWriter = new FileWriter("HoQuangChung_22001549_Mylist.txt");
            StringBuilder result = new StringBuilder();
            result.append("ArrayList test result: \n");
            result.append(testMyArrayList());
            result.append("\n LinkedList test result: \n");
            result.append(testMyLinkedList());
            myWriter.write(result.toString());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static String testMyArrayList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyArrayList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        MyArrayList list = new MyArrayList();
        list.append(1.0);
        list.append(2.0);
        list.append(3.0);
        list.append(4.0);
        list.append(5.0);
        list.append(10.0);

        BasicStatistic bs = new BasicStatistic(list);
        return bs.toString();
    }

    public static String testMyLinkedList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */

        MyLinkedList list = new MyLinkedList();
        list.append(1.0);
        list.append(2.0);
        list.append(3.0);
        list.append(4.0);
        list.append(5.0);
        list.append(10.0);

        BasicStatistic bs = new BasicStatistic(list);
        return bs.toString();

    }
}
