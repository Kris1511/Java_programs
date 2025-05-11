package learn.hiber6_onetoone;

import jakarta.persistence.*;

@Entity
public class AadharCard {
	
	@Id
	private int aadNum;
	private String name;
	private String address;
	private String gender;
	
	@OneToOne
	private Person person;
	
	public AadharCard() {
		
	}
	
	public AadharCard(int aadNum, String name, String address, String gender, Person person) {
		this.aadNum = aadNum;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.person = person;
	}

	public int getAadNum() {
		return aadNum;
	}

	public void setAadNum(int aadNum) {
		this.aadNum = aadNum;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "AadharCard [aadNum=" + aadNum + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ ", person=" + person + "]";
	}
	
	

}
