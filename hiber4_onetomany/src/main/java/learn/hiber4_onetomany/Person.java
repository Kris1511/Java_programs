package learn.hiber4_onetomany;

import java.util.List;

import jakarta.persistence.*;


@Entity
public class Person {
	
	@Id
	int id;
	String name;
	
	@OneToMany
	List<Bike> bikeList;
	
	public Person() {
		super();
	}
	
	public Person(int id, String name, List<Bike> bikeList) {
		this.id = id;
		this.name = name;
		this.bikeList = bikeList;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Bike> getBikeList() {
		return bikeList;
	}
	
	public void setBikeList(List<Bike> bikeList) {
		this.bikeList = bikeList;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", bikeList=" + bikeList + "]";
	}
	
}
