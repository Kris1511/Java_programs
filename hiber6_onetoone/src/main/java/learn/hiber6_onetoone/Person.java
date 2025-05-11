package learn.hiber6_onetoone;

import jakarta.persistence.*;

@Entity
public class Person {
	
	@Id
	private int id;
	private String name;
	
	@OneToOne
	AadharCard card;
	
	public Person() {
		
	}
	
	public Person(int id, String name, AadharCard card) {
		this.id = id;
		this.name = name;
		this.card = card;
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

	public AadharCard getCard() {
		return card;
	}

	public void setCard(AadharCard card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", card=" + card + "]";
	}	

}
