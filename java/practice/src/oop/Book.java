package oop;

import java.util.ArrayList;

public class Book {
	static ArrayList<Book> collection = new ArrayList<Book>();
	
	public String title;
	public String author;
	public String isbn;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	public static void collectionAdd(Book book) {
		collection.add(book);
	}
	
	public static void collectionRemove(Book book) {
		collection.remove(book);
	}
	
	public static void main(String[] args) {
		Book book1 = new Book("Pride and Prejudice", "Jane Austen", "0141439513");
		Book.collectionAdd(book1);
		
		Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
		Book.collectionAdd(book2);
		
		Book book3 = new Book("Catch-22", "Joseph Heller", "1451626657");
		Book.collectionAdd(book3);
		
		System.out.println(Book.collection.get(0).title);
		System.out.println(Book.collection.get(0).author);
		System.out.println(Book.collection.get(0).isbn);
		
		System.out.println(Book.collection.get(1).title);
		System.out.println(Book.collection.get(1).author);
		System.out.println(Book.collection.get(1).isbn);
		
		System.out.println(Book.collection.get(2).title);
		System.out.println(Book.collection.get(2).author);
		System.out.println(Book.collection.get(2).isbn);
		
		Book.collectionRemove(book1);
		Book.collectionRemove(book2);
		Book.collectionRemove(book3);
	}

}
