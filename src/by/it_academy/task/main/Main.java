package by.it_academy.task.main;

import by.it_academy.task.book.Book;
import by.it_academy.task.book.Bookshop;
import by.it_academy.task.logic.ListBook;
import by.it_academy.task.logic.SearchBookshop;
import by.it_academy.task.view.ViewBook;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] b = new Book[7];
		b[0] = new Book(0, "Изучаем Java", "Берт Бейтс, Кэти Сьерра", "Эксмо", 2015, 720, 58.37, 0);
		b[1] = new Book(1, "Программирование на Java для начинающих", "Алексей Васильев", "Эксмо", 2017, 704, 39.29, 1);
		b[2] = new Book(2, "Объектно-ориентированное программирование в С++", "Роберт Лафоре", "Питер", 2019, 928,
				61.29, 0);
		b[3] = new Book(3, "Программирование на C++ в примерах и задачах", "Алексей Васильев", "Эксмо", 2018, 368,
				29.19, 1);
		b[4] = new Book(4, "Философия Java", "Брюс Эккель", "Питер", 2019, 1168, 82.12, 0);
		b[5] = new Book(5, "Чистый код. Создание, анализ и рефакторинг", "Роберт Мартин", "Питер", 2021, 464, 26.71, 1);
		b[6] = new Book(6, "Чистая архитектура. Искусство разработки программного обеспечения", "Роберт Мартин",
				"Питер", 2021, 352, 33.19, 1);

		Bookshop bs = new Bookshop("Программирование", "2A");

		ListBook lb = new ListBook();

		for (Book temp : b) {
			lb.addBook(bs, temp);
		}

		SearchBookshop sb = new SearchBookshop();

		ViewBook.printList(sb.searchauthors(bs, "Васильев"));

		System.out.println("------------");

		ViewBook.printList(sb.searchauthors(bs, "Роберт"));

		System.out.println("------------");

		ViewBook.printList(sb.searchpublisher(bs, "Питер"));

		System.out.println("------------");

		ViewBook.printList(sb.searchyear(bs, 2018));
	}

	

}
