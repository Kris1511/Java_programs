package learn.hiber10_manytomany;

import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String title;
	int relYear;
	
	@ManyToMany(mappedBy = "books")
	Set<Author> authors;
	
	public Books() {
		
	}
	
	public Books(String title, int relYear, Set<Author> authors) {
		this.title = title;
		this.relYear = relYear;
		this.authors = authors;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setYear(int relYear) {
		this.relYear = relYear;
	}
	
	public int getYear() {
		return relYear;
	}
	
	public void setAuthor(Set<Author> authors) {
		this.authors = authors;
	}
	
	public Set<Author> getAuthor() {
		return authors;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", title=" + title + ", year=" + relYear + ", authors=" + authors + "]";
	}

}