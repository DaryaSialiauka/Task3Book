package by.it_academy.task.book;

import java.util.ArrayList;
import java.util.List;

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

	public List<Book> searchauthors(String authors) {
		List<Book> temp = new ArrayList<>();
		for (Book b : this.book) {
			if (b.getAuthors().indexOf(authors) >= 0) {
				temp.add(b);
			}
		}
		return temp;
	}

	public List<Book> searchpublisher(String publisher) {
		List<Book> temp = new ArrayList<>();
		for (Book b : this.book) {
			if (b.getPublisher().equals(publisher)) {
				temp.add(b);
			}
		}
		return temp;
	}

	public List<Book> searchyear(int year) {
		List<Book> temp = new ArrayList<>();
		for (Book b : this.book) {
			if (b.getYearPublishing() >= year) {
				temp.add(b);
			}
		}
		return temp;
	}
	
	public void addBook(Book b) {
		this.book.add(b);
	}
	
	public void removeBook(int i) {
		this.book.remove(i);
	}

}
