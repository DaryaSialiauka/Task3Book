package by.it_academy.task.logic;

import by.it_academy.task.book.Book;
import by.it_academy.task.book.Bookshop;

public class ListBook {
	
	public void addBook(Bookshop bs, Book b) {
		bs.getBook().add(b);
	}

	public void removeBook(Bookshop bs, int i) {
		bs.getBook().remove(i);
	}

}
