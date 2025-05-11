package learn.hiber7_onetomany;

import jakarta.persistence.*;

@Entity
public class Car {
	
	@Id
	int id;
	String name;
	String modelName;
	int price;
	
	@ManyToOne
	Person person;
	
	public Car() {
		super();
	}
	
	public Car(int id, String name, String modelName, int price, Person person) {
		this.id = id;
		this.modelName = modelName;
		this.name = name;
		this.price = price;
		this.person = person;
	}
	
	public int setId() {
		return id;
	}
	
	public void getIt(int id) {
		this.id = id;
	}
	
	public String setModel() {
		return modelName;
	}
	
	public void getModel(String modelName) {
		this.modelName = modelName;
	}
	
	public String setName() {
		return name;
	}
	
	public void getName(String name) {
		this.name = name;
	}
	
	public int setPrice() {
		return price;
	}
	
	public void getPrice(int price) {
		this.price = price;
	}
	
	public Person setPerson() {
		return person;
	}
	
	public void getPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", modelName=" + modelName + ", name=" + name + ", price=" + price + ", person="
				+ person + "]";
	}
	

}













