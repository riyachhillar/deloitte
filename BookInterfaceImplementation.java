package com.deloitte.library.services;

import com.deloitte.library.dao.BooksDAO;
import com.deloitte.library.model.Books;

public class BookInterfaceImplementation implements BooksInterface {

	@Override
	public void insertBook(String bookName, String author, int price) {
		// TODO Auto-generated method stub

		Books obj = new Books();
		obj.setBookId(Books.getCount());
		obj.setBookName(bookName);
		obj.setAuthor(author);
		obj.setPrice(price);
	BooksDAO.addBook(obj);
	}
	

}
