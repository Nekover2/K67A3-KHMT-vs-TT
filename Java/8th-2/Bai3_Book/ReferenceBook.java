package Bai3_Book;
public class ReferenceBook extends Book {
	private double tax;
	public ReferenceBook(String id, String name, int quantity, String publisher, double price) {
		setId(id);
		setName(name);
		setQuantity(quantity);
		setPublisher(publisher);
		setPrice(price);
		// TODO Auto-generated constructor stub
	}
	
	public ReferenceBook(String id, String name, int quantity, String publisher, double price, double tax) {
	    setId(id);
		setName(name);
		setQuantity(quantity);
		setPublisher(publisher);
		setPrice(price);
		this.tax=tax;
	}

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		return getPrice()*getQuantity() + tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook [tax=" + tax + ", getId()=" + getId() + ", getName()=" + getName() + ", getQuantity()="
				+ getQuantity() + ", getPublisher()=" + getPublisher() + ", getPrice()=" + getPrice()+ ", getAmount()=" + getAmount() +  "]";
	}
}