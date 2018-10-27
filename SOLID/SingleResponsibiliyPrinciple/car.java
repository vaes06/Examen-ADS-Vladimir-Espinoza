package SingleResponsibiliyPrinciple;

public class car {
	
	int age;
	String brand;
	int price;
	

	public car(int age, String brand, int price){
		this.age = age;
		this.brand= brand;
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String getbrand() {
		return this.brand;
	}
	public int getPrice() {
		return this.price;
	}

}

