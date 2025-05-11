package learn.hiber10_manytomany;

import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String authorName;
	int birthYear;
	
	@ManyToMany
	@JoinTable(
			name = "author_book",
			joinColumns = @JoinColumn(name = "author_id"),
			inverseJoinColumns = @JoinColumn(name = "book_id")
			)
	Set<Books> books;
	
	public Author() {
		
	}
	
	public Author(String authorName, int birthYear, Set<Books> books) {
		this.authorName = authorName;
		this.birthYear = birthYear;
		this.books = books;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public Set<Books> getBooks() {
		return books;
	}

	public void setBooks(Set<Books> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", authorName=" + authorName + ", birthYear=" + birthYear + ", books=" + books
				+ "]";
	}
	
}