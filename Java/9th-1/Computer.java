

public class Computer {
    
    // khai báo các thuộc tính của một computer
    // tạo tất cả các hàm dựng (có đối và không đối)
    // xây dựng các hàm getter, setter phù hợp với các thuộc tính
    // 
    private String  ten;
    private String  hangsx;
    private int     namsx;
    private String  chitiet;
    private double  price;
	
	public Computer() {
	}
	
	public String getTen() {
        return ten;
    }

    public String getHangsx() {
        return hangsx;
    }

    public int getNamsx() {
        return namsx;
    }

    public String getChitiet() {
        return chitiet;
    }

    public double getPrice() {
        return price;
    }

    public Computer(String name, String manu, int year, String detail, double price) {
	    this.ten        = name;
	    this.hangsx     = manu;
	    this.namsx      = year;
	    this.chitiet    = detail;
	    this.price      = price;
	}

    // Hàm trả về một chuỗi thông tin của một máy tính, mỗi thuộc tính cách nhau một dấu cách
	@Override
	public String toString() {
		return ten + " " + hangsx + " " + namsx + " " + chitiet + " " + price;
	}
}
