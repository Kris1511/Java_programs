package learn.hiber9_manytomany;

import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String courseName;
	private String courseType;
	
	@ManyToMany(mappedBy = "courses")
	private Set<Student> students; 	
	
	public Course() {
		
	}
	
	public Course( String courseName, String courseType, Set<Student> students) {
		this.courseName = courseName;
		this.courseType = courseType;
		this.students = students;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	
	public String getCourseType() {
		return courseType;
	}
	
	public void setStudent(Set<Student> students) {
		this.students = students;
	}
	
	public Set<Student> getStudent() {
		return students;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", courseType=" + courseType + ", students="
				+ students + "]";
	}

}
