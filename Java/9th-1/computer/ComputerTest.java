import java.util.*;

public class ComputerTest {
	
	private Computer computers[];
	private int n;
	
	// Hàm nhập vào số n và một mảng gồm thông tin của n máy tính
	public void input(Scanner sc)
	{
	    n = Integer.parseInt(sc.nextLine());
	    computers = new Computer[n];
	    for(int i=0;i<n;i++)
	    {
	        String name = sc.nextLine();
	        String manu = sc.nextLine();
	        int    year = Integer.parseInt(sc.nextLine());
	        String detl = sc.nextLine();
	        double pric = Double.parseDouble(sc.nextLine());
	        //
	        computers[i] = new Computer(name, manu, year, detl, pric);
	    }
	}
	
	// in ra các máy tính, mỗi thông tin của một máy tính trên một dòng
	public void output()
	{
		for( Computer com : computers )
		    System.out.println(com.toString());
		return;
	}
	
	// Trả về giá trung bình của các máy tính
	public double getAvgPrice()
	{
	    double sum = 0;
	    for( Computer com : computers )
	        sum+= com.getPrice();
	        
		return sum/n;
	}
	
	// In ra các máy tính có giá cao nhất
	public void getMaxPrice()
	{
		double maxP = computers[0].getPrice();
		for( Computer com : computers )
		    if(com.getPrice() > maxP) maxP = com.getPrice();
		    
		//
		for( Computer com : computers )
		    if(com.getPrice() == maxP)  System.out.println(com.toString());
		return;
	}
	
	// In ra các máy tính có nhà sản xuất là Dell
	public void getDell()
	{
	    for( Computer com : computers )
	        if(com.getHangsx().equals("Dell")) System.out.println(com.toString());
	}
	
	// Sắp xếp các máy tính theo chiều giảm dần của giá, và in ra mảng sau khi sắp xếp
	public void sort()
	{
// 		Arrays.sort(computers, new Comparator<Computer>() {
// 		    public int compare( Computer c1, Computer c2 )
// 		    {
// 	            if(c1.getPrice() - c2.getPrice() > 0 ) return 1;
// 		        else return 1;
// 		    }
// 		});
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
                if(computers[i].getPrice() < computers[j].getPrice())
                {
                    Computer tmp = computers[i];
                    computers[i] = computers[j];
                    computers[j] = tmp;
                }
		output();
	}
	
	public static void main(String[] args) {

	}

}
