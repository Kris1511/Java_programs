package learn.hiber8_manytomany;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Tech {
	
	@Id
	int techId;
	String techName;
	int techBorn;
	
	@ManyToMany
	List<Trainer> trainerList;
	
	public Tech() {
		
	}
	
	public Tech(int techId, String techName, int techBorn, List<Trainer> trainerList) {
		this.techId = techId;
		this.techName = techName;
		this.techBorn = techBorn;
		this.trainerList = trainerList;		
	}
	
	public void setId(int techId) {
		this.techId = techId;
	}
	
	public int getId() {
		return techId;
	}
	
	public void setTechName(String techName) {
		this.techName = techName;
	}
	
	public String getTechName() {
		return techName;
	}
	
	public void setTechBorn(int techBorn) {
		this.techBorn = techBorn;
	}
	
	public int getTechBorn() {
		return techBorn;
	}
	
	public void setTrainer(List<Trainer> trainerList) {
		this.trainerList = trainerList;
	}
	
	public List<Trainer> getTrainer() {
		return trainerList;
	}
	
	@Override
	public String toString() {
		return "Tech [techId=" + techId + ", techName=" + techName + ", techBorn=" + techBorn + ", trainerList="
				+ trainerList + "]";
	}

}

