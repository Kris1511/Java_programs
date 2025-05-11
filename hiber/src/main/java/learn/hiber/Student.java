package learn.hiber;

import jakarta.persistence.*;

@Entity
public class Student {
	
	@Id
	int kodId;
	String name;
	String address;
	int yearOfPass;
	
	public Student(int kodId, String name, String address, int yearOfPass) {
		this.kodId = kodId;
		this.name = name;
		this.address = address;
		this.yearOfPass = yearOfPass;
	}

}
