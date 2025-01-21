package com.xworkz.assign.runner;

import com.xworkz.assign.things.BookDetails;
import com.xworkz.assign.things.BookLogs;

public class BookRunner {

	public static void main(String[] args) {
		System.out.println("Main method");
		
		BookDetails book1 = new BookDetails();
        book1.setBookId(1);
        book1.setBookName("Harry Potter");
        book1.setAuthorName("JK Rowling");
        book1.setAuthorEmail("jk.rowling@example.com");
        book1.setPublishedBy("Bloomsbury");
        book1.setPlaceOfPublication("London");
        book1.setLanguage("English");
        book1.setBookPrice(500);
        
        BookDetails book2 = new BookDetails();
        book2.setBookId(2);
        book2.setBookName("The Monk Who Sold His Ferrari");
        book2.setAuthorName("Robin Sharma");
        book2.setAuthorEmail("robin.sharma@example.com");
        book2.setPublishedBy("HarperOne");
        book2.setPlaceOfPublication("San Francisco");
        book2.setLanguage("English");
        book2.setBookPrice(300);
          
        BookDetails book3 = new BookDetails();
        book3.setBookId(3);
        book3.setBookName("The Alchemist");
        book3.setAuthorName("Paulo Coelho");
        book3.setAuthorEmail("paulo.coelho@example.com");
        book3.setPublishedBy("HarperTorch");
        book3.setPlaceOfPublication("Rio de Janeiro");
        book3.setLanguage("Portuguese");
        book3.setBookPrice(400);
        
        BookDetails book4 = new BookDetails();
        book4.setBookId(4);
        book4.setBookName("The Hobbit");
        book4.setAuthorName("J.R.R. Tolkien");
        book4.setAuthorEmail("tolkien@example.com");
        book4.setPublishedBy("George Allen & Unwin");
        book4.setPlaceOfPublication("London");
        book4.setLanguage("English");
        book4.setBookPrice(450);
        
        BookDetails book5 = new BookDetails();
        book5.setBookId(5);
        book5.setBookName("Who Will Cry When You Die?");
        book5.setAuthorName("Robin Sharma");
        book5.setAuthorEmail("robin.sharma@example.com");
        book5.setPublishedBy("Jaico Publishing House");
        book5.setPlaceOfPublication("Mumbai");
        book5.setLanguage("English");
        book5.setBookPrice(350);

        //Save
        BookLogs logs = new BookLogs();
        logs.saveBookLogs(book1);
        logs.saveBookLogs(book2);
        logs.saveBookLogs(book3);
        logs.saveBookLogs(book4);
        logs.saveBookLogs(book5);
        
        //Read
        System.out.println("\n-----Read------\n");
        logs.readBookLogs();
        
        BookDetails updateBook = new BookDetails();
        updateBook.setBookId(2);
        updateBook.setBookName("Wings of Fire");
        updateBook.setAuthorName("Dr. A.P.J. Abdul Kalam");
        updateBook.setAuthorEmail("abdul.kalam@example.com");
        updateBook.setPublishedBy("Hyderabad Press");
        updateBook.setPlaceOfPublication("Hyderabad");
        updateBook.setLanguage("Hindi");
        updateBook.setBookPrice(250);
        
        System.out.println("\n-----Update------\n");
        logs.updateBookLogs(updateBook);
        
        System.out.println("\n-----Read------\n");
        logs.readBookLogs();
        
        System.out.println("\n-----Delete------\n");
        logs.deleteBookLogs(3);
        
        System.out.println("\n-----Read------\n");
        logs.readBookLogs();
        
        System.out.println("\n-----Read------\n");
        logs.searchBookLogs(4);
		
		
	}
}
