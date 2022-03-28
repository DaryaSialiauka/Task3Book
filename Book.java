package by.it_academy.task.book;

public class Book {
	private int id;
	private String bookname;
	private String authors;
	private String publisher;
	private int yearpublishing;
	private int amount;
	private double price;
	private int type;

	public Book(int id, String bookname, String authors, String publisher, int yearpublishing, int amount, double price,
			int type) {
		this.setId(id);
		this.setBookname(bookname);
		this.setAuthors(authors);
		this.setPublisher(publisher);
		this.setYearpublishing(yearpublishing);
		this.setAmount(amount);
		this.setPrice(price);
		this.setType(type);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id >= 0) {
			this.id = id;
		} else {
			this.id = 0;
		}
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearpublishing() {
		return yearpublishing;
	}

	public void setYearpublishing(int yearpublishing) {
		if (yearpublishing > 1444) {
			this.yearpublishing = yearpublishing;
		} else {
			this.yearpublishing = 0;
		}
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		if (amount > 0) {
			this.amount = amount;
		} else {
			this.amount = 1;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		} else {
			this.price = 0;
		}
	}

	public String getType() {
		return (type == 0 ? "твердый" : "мягкий");
	}

	public void setType(int type) {
		if (type == 0 || type == 1) {
			this.type = type;
		} else {
			this.type = 0;
		}
	}

	public String toString() {
		return "Наименование: " + bookname + ", автор(ы): " + authors + ", издательство: " + publisher
				+ ", год издания: " + yearpublishing + ", кол-во страниц: " + amount + ", цена: " + price
				+ ", тип переплета: " + (type == 0 ? "твердый" : "мягкий");
	}

}
