public class Baby {
    
    // khai báo các thuộc tính của một baby
    // tạo tất cả các hàm dựng (có đối và không đối)
    // xây dựng các hàm getter, setter phù hợp với các thuộc tính
    private String day = "01/01/2020";
    private String name = "UnRegistered";
    private boolean gender;
    private double weight, length;
	public Baby() {
	}

	public Baby(String bbName, String bbDay, boolean bbGender, double bbWeight, double bbLength) {
	    name = bbName;
	    day  = bbDay;
	    gender = bbGender;
	    weight = bbWeight;
	    length = bbLength;
	}
	
	public String getName(){ return name; }
	
	public String getGender(){ return gender ? "Girl" : "Boy"; }
	public double getWeight() { return weight; }
    /*
        Lưu ý, đối với hàm public String getGender() sẽ trả về Boy nếu gender = false, ngược lại trả về "Girl"
    */
    // in ra thong tin cua baby theo thu tu: ten, ngay thang nam sinh, gioi tinh, can nang, chieu cao
	public String toString() {
	    return getName() + " " + this.day + " " + getGender() + "  " + this.length + " " + this.weight;
	}

}