package com.practice.streams.examples.comparator.book;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class NameComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o2.getName().compareTo(o1.getName());
	}

}

class idDescComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o2.getId() - o1.getId();
	}

}

public class BookService {

	public List<Book> getAllBooksInOrderByName() {

		List<Book> allBooks = new BookDAO().getAllBooks();

		Collections.sort(allBooks, new NameComparator());
		Collections.sort(allBooks, new idDescComparator()); // traditional approach

		Collections.sort(allBooks, (b1, b2) -> {return b1.getPages() - b2.getPages();}); // lambda approach

		return allBooks;
	}

	public static void main(String[] args) {
		BookService bookService = new BookService();
		System.out.println(bookService.getAllBooksInOrderByName());
	}

}
