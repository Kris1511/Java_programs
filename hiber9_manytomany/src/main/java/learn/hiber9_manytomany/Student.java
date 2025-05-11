package learn.hiber9_manytomany;

import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String studentName;
	private String studentEdu;
	
	@ManyToMany
	@JoinTable(
			name = "student_course",
			joinColumns = @JoinColumn(name = "student_id"),
			inverseJoinColumns = @JoinColumn(name = "course_id"))
	private Set<Course> courses;
	
	public Student() {
		
	}
	
	public Student(Long id, String studentName, String studentEdu, Set<Course> courses) {
		this.id = id;
		this.studentName = studentName;
		this.studentEdu = studentEdu;
		this.courses = courses;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentEdu(String studentEdu) {
		this.studentEdu = studentEdu;
	}
	
	public String getStudentEdu() {
		return studentEdu;
	}
	
	public void setCourse(Set<Course> courses) {
		this.courses = courses;
	}
	
	public Set<Course> getCourse() {
		return courses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", studentEdu=" + studentEdu + ", courses="
				+ courses + "]";
	}

}
