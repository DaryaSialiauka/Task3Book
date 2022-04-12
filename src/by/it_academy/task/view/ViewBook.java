package by.it_academy.task.view;

import java.util.List;

import by.it_academy.task.book.Book;

public class ViewBook {

	public static void printList(List<Book> c) {
		for (Book cus : c) {
			System.out.println(cus);
		}
	}
}
