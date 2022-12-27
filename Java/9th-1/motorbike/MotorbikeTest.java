import java.util.Scanner;

public class MotorbikeTest
{
    public static Motorbike[] inputMotorbike (Scanner sc)
	{
	    int n = Integer.parseInt(sc.nextLine());
	    Motorbike[] arr = new Motorbike[n];
	    for(int i=0;i<n;i++)
	    {
	        String id = sc.nextLine();
	        String name = sc.nextLine();
	        String manu = sc.nextLine();
	        int quantity = Integer.parseInt(sc.nextLine());
	        double price = Double.parseDouble(sc.nextLine());
	        double weight= Double.parseDouble(sc.nextLine());
	        String date = sc.nextLine();
	        arr[i] = new Motorbike(id, name, manu, quantity, price, weight, date);
	    }
	    return arr;
	}
	public static void outputMotorbike (Motorbike[]  motorbikes)
	{
		for(Motorbike motor : motorbikes)
		    motor.printMotorbike();
	}
	public static Motorbike[]  searchM(String manu, Motorbike[]  motorbikes)
	{
		int cnt =0;
		for(Motorbike motor : motorbikes)
		    if(motor.getManu().equals(manu)) cnt++;
		    
		Motorbike[] res = new Motorbike[cnt];
		cnt=0;
		
		for(Motorbike motor : motorbikes)
		    if(motor.getManu().equals(manu)) res[cnt++] = motor;
		    
		return res;
	}
	public static Motorbike[]  maxWeight(Motorbike[]  motorbikes)
	{
		Double maxW = motorbikes[0].getWeight();
		int cnt = 0;
		
		for(Motorbike motor : motorbikes)
		    if(motor.getWeight() > maxW )
		    {
		        maxW = motor.getWeight();
		        cnt = 1;
		    }
		    else if(motor.getWeight() == maxW) cnt++;
		    
		    
		Motorbike[] res = new Motorbike[cnt];
		cnt=0;
		for(Motorbike motor : motorbikes)
		    if(motor.getWeight() == maxW) res[cnt++] = motor;
		return res;
	}
	public static Motorbike[]  minQuantity (Motorbike[]  motorbikes)
	{
		int minQ = motorbikes[0].getQuantity();
		int cnt = 0;
		
		for(Motorbike motor : motorbikes)
		    if(motor.getQuantity() < minQ )
		    {
		        minQ = motor.getQuantity();
		        cnt = 1;
		    }
		    else if(motor.getQuantity() == minQ) cnt++;
		    
		    
		Motorbike[] res = new Motorbike[cnt];
		cnt=0;
		for(Motorbike motor : motorbikes)
		    if(motor.getQuantity() == minQ) res[cnt++] = motor;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Motorbike[] arr = inputMotorbike(sc);
		int choice = sc.nextInt();
		sc.close();
		switch(choice)
		{
		    case 1:
		        outputMotorbike(searchM("Honda", arr));
		        break;
		    case 2:
		        outputMotorbike(maxWeight(arr));
		        break;
		    case 3:
		        outputMotorbike(minQuantity(arr));
		        break;
		}
	}
}