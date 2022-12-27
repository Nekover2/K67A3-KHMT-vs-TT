import java.util.*;

public class ManageBabies {
	
    
	
	/*  Nhap vao thong tin cua n baby tu ban phim. Cac thong tin theo thu tu ten, ngay thang nam sinh, gioi tinh
	gioi tinh, can nang, chieu cao
	*/
	
	// nhap vao so nguyen duong n va thong tin cua n baby
	Baby[] createData (Scanner sc)
	{
	    int n = sc.nextInt();
	    Baby[] arr = new Baby[n];
	    sc.nextLine();
	    for( int i=0; i<n ; i++)
	    {
	        String name = sc.nextLine();
	        String dob = sc.nextLine();
	        boolean gender = sc.nextBoolean();
	        double weight = sc.nextDouble(), height = sc.nextDouble();
	        sc.nextLine();
	        arr[i] = new Baby(name, dob, gender, weight, height);
	    }
	    return arr;
	}
	
	 // In ra thong tin cua n baby sau khi chuan hoa ho ten
	void printInforBabies (Baby babies[])
	{
	    for(Baby val : babies)
	        System.out.println(val.toString());
	}
	// Sap xep cac baby theo trong luong giam dan
	void sortWeight (Baby babies[])
	{
	    //Anonymous comparator :v hell yeah, so complicating
        Arrays.sort(babies, new Comparator<Baby>(){
            public int compare(Baby s1, Baby s2) {
                if(s1.getWeight() > s2.getWeight()) return -1;
                else return 1;
            }
        });
	}
	// Loc ra tat ca nhung baby co gioi tinh la gende
	void filterGender(Baby babies[], String gender)
	{
	    for( Baby val : babies )
	        if(val.getGender() == gender) System.out.println(val.toString());
	}
	public static void main(String[] args) {
        
	}

}