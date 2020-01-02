package com.deloitte.library.model;

public class Books {
	private int bookId;
	private String bookName;
	private String author;
	private int price;
	private static int count=1000;
	public int getBookId() {
		return bookId;
	}

	public static int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public Books() {
		count++;
		
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "LibraryManagement [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price="
				+ price + "]";
	}
	
	
}
