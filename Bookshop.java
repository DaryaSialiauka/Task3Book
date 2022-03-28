package by.it_academy.task.book;

public class Bookshop {

	private Book[] book;
	private String section;
	private String storage;

	public Bookshop(Book[] b, String section, String storage) {
		this.setBook(b);
		this.setSection(section);
		this.setStorage(storage);
	}

	public Book[] getBook() {
		return book;
	}

	public void setBook(Book[] b) {
		this.book = b;
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

	public void searchauthors(String authors) {
		Book[] b = this.getBook();
		for (int i = 0; i < b.length; i++) {
			if (b[i].getAuthors().indexOf(authors) >= 0) {
				System.out.println(b[i].toString());
			}
		}
	}

	public void searchpublisher(String publisher) {
		Book[] b = this.getBook();
		for (int i = 0; i < b.length; i++) {
			if (b[i].getPublisher().equals(publisher)) {
				System.out.println(b[i].toString());
			}
		}
	}

	public void searchyear(int year) {
		Book[] b = this.getBook();
		for (int i = 0; i < b.length; i++) {
			if (b[i].getYearpublishing() >= year) {
				System.out.println(b[i].toString());
			}
		}
	}

}
