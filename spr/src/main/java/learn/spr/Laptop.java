package learn.spr;

public class Laptop {
	
	String brand;
	int price;
	String color;
	
	public Laptop() {
		
	}
	
	public Laptop(String brand, int price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Laptop [brand= " + brand + ", price= " + price + ", color= " + color + "]";
	}

}
