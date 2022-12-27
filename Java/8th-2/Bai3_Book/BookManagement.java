package Bai3_Book;
import java.util.*;

public class BookManagement {
    /* Thứ tự nhập
        +) Số lượng các cuốn sách

        +) 1 số nguyên 0 hoặc 1 (nếu 0 là sách tham khảo, 1 là sách giáo khoa)

        +)  id (mã sách), name (tên sách), quantity (số lượng), publisher (NXB), price (giá)

        +)  status (trạng thái) với sách giáo khoa,  tax (thuế) đối với sách tham khảo.
    */
	public Book[] readData(Scanner sc) {
		int n = sc.nextInt();
		Book[] arr = new Book[n];
		for(int i=0;i<n;i++)
		{
		    int type = sc.nextInt();
		    sc.nextLine();
		    String _id = sc.nextLine(), _name = sc.nextLine();
		    int _quanti = sc.nextInt();
		    sc.nextLine();
		    String _pub = sc.nextLine();
		    double _price= sc.nextDouble();
		    if(type == 0) 
		    {
		        double _tax = sc.nextDouble();
		        arr[i] = new ReferenceBook(_id, _name, _quanti, _pub, _price, _tax);
		    }
		    else
		    {
		        boolean _stat = sc.nextBoolean();
		        arr[i] = new TextBook(_id, _name, _quanti, _pub, _price, _stat);
		    }
		    sc.nextLine();
		}
		return arr;
	}
    // In thong tin các cuốn sách
	public void printBooks(Book[] books) {
		for(int i=0;i<books.length;i++)
		    System.out.println(books[i].toString());
	}
    // Tìm các cuốn sách của nhà xuất bản publisher
	public ArrayList<Book> findBooks(Book[] books, String publisher) {
	    ArrayList<Book> arr = new ArrayList<Book>();
	    for(int i=0;i<books.length;i++)
	        if(books[i].getPublisher().equals(publisher)) arr.add(books[i]);
	    return arr;
	}
    // Tính giá trị trung bình của các cuốn sách thuộc thể loại typeOfBooks
	public double computeAverage(Book[] books, String typeOfBooks) {
	    double sum = 0;
	    int cnt = 0;
	    for(int i=0;i<books.length;i++)
	        if(books[i].getClass().getName().equals(typeOfBooks))
	        {
	            sum+= books[i].getAmount();
	            cnt++;
	        }
        return sum/cnt;
	}
    // Sắp xếp các cuốn sách tăng dần về giá tiền
	public void sortByPrice(Book[] books) {
	    Arrays.sort(books, new Comparator<Book>(){
            public int compare(Book s1, Book s2) {
                if(s1.getPrice() > s2.getPrice()) return 1;
                else return -1;
            }
        });
	}

	public static void main(String[] args) {
	}
}
