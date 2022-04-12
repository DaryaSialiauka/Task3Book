package by.it_academy.task.logic;

import java.util.ArrayList;
import java.util.List;

import by.it_academy.task.book.Book;
import by.it_academy.task.book.Bookshop;

public class SearchBookshop {

	public List<Book> searchpublisher(Bookshop b, String publisher) {
		List<Book> temp = new ArrayList<>();
		for (Book btemp : b.getBook()) {
			if (btemp.getPublisher().equals(publisher)) {
				temp.add(btemp);
			}
		}
		return temp;
	}

	public List<Book> searchauthors(Bookshop b, String authors) {
		List<Book> temp = new ArrayList<>();
		for (Book btemp : b.getBook()) {
			if (btemp.getAuthors().indexOf(authors) >= 0) {
				temp.add(btemp);
			}
		}
		return temp;
	}

	public List<Book> searchyear(Bookshop b, int year) {
		List<Book> temp = new ArrayList<>();
		for (Book btemp : b.getBook()) {
			if (btemp.getYearPublishing() >= year) {
				temp.add(btemp);
			}
		}
		return temp;
	}

}
