package learn.hiber4;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	int id;
	String name;
	String address;
	int yop;
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, String address, int yop) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.yop = yop;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", yop=" + yop + "]";
	}
	

}
