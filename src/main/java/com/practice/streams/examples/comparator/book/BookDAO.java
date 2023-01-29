package com.practice.streams.examples.comparator.book;

import java.util.Arrays;
import java.util.List;

public class BookDAO {

	List<Book> getAllBooks() {

		List<Book> allBooks = Arrays.asList(new Book(1, "Java", 123), new Book(2, "Python", 333),
				new Book(3, "Angular", 546), new Book(4, "JavaScript", 465), new Book(5, "Java for Dummies", 1243),
				new Book(6, "Hello Python", 3345));

		return allBooks;
	}

}
