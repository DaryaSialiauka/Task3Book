package by.it_academy.task.book;

import java.util.Objects;

public class Book {
	private int id;
	private String bookName;
	private String authors;
	private String publisher;
	private int yearPublishing;
	private int amountPage;
	private double price;
	private int type;
	
	private static final int HARD = 0;
	private static final int SOFT = 1;
	private static final int MIN_YEAR_PUBLISHING = 1445;
	private static final int MIN_AMOUNT_PAGE = 2;
	
	

	public Book() {
		this(0,"","","",MIN_YEAR_PUBLISHING,MIN_AMOUNT_PAGE,0,HARD);
	}

	public Book(int id, String bookName, String authors, String publisher, int yearPublishing, int amountPage, double price,
			int type) {
		this.setId(id);
		this.setBookName(bookName);
		this.setAuthors(authors);
		this.setPublisher(publisher);
		this.setYearPublishing(yearPublishing);
		this.setAmountPage(amountPage);
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

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
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

	public int getYearPublishing() {
		return yearPublishing;
	}

	public void setYearPublishing(int yearPublishing) {
		if (yearPublishing >= MIN_YEAR_PUBLISHING) {
			this.yearPublishing = yearPublishing;
		} else {
			this.yearPublishing = 0;
		}
	}

	public int getAmountPage() {
		return amountPage;
	}

	public void setAmountPage(int amountPage) {
		if (amountPage >= MIN_AMOUNT_PAGE) {
			this.amountPage = amountPage;
		} else {
			this.amountPage = MIN_AMOUNT_PAGE;
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

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = (type == 0 ? HARD : SOFT);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amountPage, authors, bookName, id, price, publisher, type, yearPublishing);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return amountPage == other.amountPage && Objects.equals(authors, other.authors)
				&& Objects.equals(bookName, other.bookName) && id == other.id
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(publisher, other.publisher) && type == other.type
				&& yearPublishing == other.yearPublishing;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", authors=" + authors + ", publisher=" + publisher
				+ ", yearPublishing=" + yearPublishing + ", amountPage=" + amountPage + ", price=" + price + ", type="
				+ type + "]";
	}
	
	

}
