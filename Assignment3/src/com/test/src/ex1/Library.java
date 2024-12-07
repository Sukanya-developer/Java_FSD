package com.test.src.ex1;

import java.util.ArrayList;

import com.test.src.ex1.Book;
/**
 *  Library  Class to store book objects 
 */
public class Library {

	ArrayList<Book> books;

	public Library() {

		books = new ArrayList<>();
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void removeBook(String id) {
		for (Book book : books) {
			if (book.bookId.equals(id)) {
				books.remove(book);
				break;
			}
		}
	}

	public void displayBooks() {
		for (Book book : books) {
			System.out.println("Title: " + book.title);
			System.out.println("Author: " + book.author);
			System.out.println("ISBN: " + book.bookId);
			System.out.println("Availability: " + book.isAvailable);
			System.out.println();
		}
	}

	public void SearchBook(String id) {
		for (Book book : books) {
			if (book.bookId.equals(id)) {
				System.out.println("Book Id :" + book.getBookId());
				System.out.println("Book Name :" + book.getTitle());
				System.out.println("Book Author :" + book.getAuthor());
				System.out.println("Book Availability :" + book.isAvailable());

			}

		}
	}
}
