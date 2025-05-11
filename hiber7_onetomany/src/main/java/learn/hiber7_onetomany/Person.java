package learn.hiber7_onetomany;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Person {
	
	@Id
	int id;
	String name;
	
	@OneToMany
	List<Car> carList;
	
	public Person() {
		super();
	}
	
	public Person(int id, String name, List<Car> carList) {
		this.id = id;
		this.name = name;
		this.carList = carList;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Car> getCarList() {
		return carList;
	}

	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", carList=" + carList + "]";
	}
	
}