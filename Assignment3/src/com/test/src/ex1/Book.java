/**
 * 
 */
package com.test.src.ex1;

/**
 *  Book Class with attributes of Bookid ,title author and availability  
 */
public class Book {

	public String bookId;
	public String title;
	public String author;
	public boolean isAvailable;

	public Book(String bookId, String title, String author, boolean isAvailable) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	/**
	 * @param args
	 */

}
