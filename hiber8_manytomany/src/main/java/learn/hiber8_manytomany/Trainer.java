package learn.hiber8_manytomany;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Trainer {
	
	@Id
	int trainerId;
	String trainerName;
	int experience;
	
	@ManyToMany
	List<Tech> techList;
	
	public Trainer() {
		
	}
	
	public Trainer(int trainerId, String trainerName, int experience, List<Tech> techList) {
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.experience = experience;
		this.techList = techList;
	}
	
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	
	public int getTrainerId() {
		return trainerId;
	}
	
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	
	public String getTrainerName() {
		return trainerName;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public int getExperience() {
		return experience;
	}
	
	public void setTechList(List<Tech> techList) {
		this.techList = techList;
	}
	
	public List<Tech> getTechList() {
		return techList;
	}

	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", experience=" + experience
				+ ", techList=" + techList + "]";
	}

}
