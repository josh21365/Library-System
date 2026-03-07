package com.joshua.library_app;


public class Book{
	private String author_of_book;
	private int quantity_of_book;
	private String genre_of_book;
	
	Book(String author_of_book, int quantity_of_book, String genre_of_book){
		this.author_of_book = author_of_book;
		this.quantity_of_book = quantity_of_book;
		this.genre_of_book = genre_of_book;
	}
	
	public String get_author() {
		return author_of_book;
	}
	public int get_book_amount() {
		return quantity_of_book;
	}
	public String get_genre() {
		return genre_of_book;
	}
	public void set_author(String author) {
	    this.author_of_book = author;
	}
	public void set_book_amount(int amount) {
	    this.quantity_of_book = amount;
	}
	public void set_genre(String genre) {
	    this.genre_of_book = genre;
	}
	
	@Override
	public String toString() {
		return "Written by: " + author_of_book +
				"\namount of copies: " + quantity_of_book + 
				"\nThe genre of the book: " + genre_of_book;
	}
}
