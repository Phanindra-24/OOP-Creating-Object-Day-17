package com.codegnan.oopexamples;

public class Book {
	private String title;
	private String author;
	private boolean isAvailable;
	
	public Book(String title, String author){
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}
	
	public void borrowBook() {
		if(isAvailable) {
			isAvailable = false;
			System.out.println("You borrowed the book: "+title);
		} else {
            System.out.println("Book " + title + " is already borrowed.");
		}
	}
	
	public void returnBook() {
		if(!isAvailable) {
			isAvailable = true;
            System.out.println("You returned the book: " + title);
		} else {
            System.out.println("Book " + title + "' was not borrowed.");
		}
	}
	
	public void displayInfo() {
		 System.out.println(" Title: " + title);
	     System.out.println(" Author: " + author);
	     System.out.println(" Available: "+(isAvailable ? "Yes":"No"));
	     System.out.println("----------------------------------");
	}
	public static void main(String[] args) {
		
	}

}