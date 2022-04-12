package by.it_academy.task.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bookshop {

	private List<Book> book;
	private String section;
	private String storage;
	
	public Bookshop() {
		this("","");
	}

	public Bookshop(String section, String storage) {
		this.book = new ArrayList<>();
		this.setSection(section);
		this.setStorage(storage);
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	@Override
	public int hashCode() {
		return Objects.hash(book, section, storage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bookshop other = (Bookshop) obj;
		return Objects.equals(book, other.book) && Objects.equals(section, other.section)
				&& Objects.equals(storage, other.storage);
	}

	@Override
	public String toString() {
		return "Bookshop [book=" + book + ", section=" + section + ", storage=" + storage + "]";
	}



}
