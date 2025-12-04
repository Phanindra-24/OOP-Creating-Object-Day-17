package com.codegnan.oopexamples;

public class LibrarySystem {

	public static void main(String[] args) {
		
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("HarryPorter", "JK Rowlling");

        b1.displayInfo();
        b2.displayInfo();

        b1.borrowBook();
        b2.borrowBook();
        
        b1.returnBook();
        b2.returnBook();
        
     
	}

}
