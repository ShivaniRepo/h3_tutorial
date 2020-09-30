package com.virtualpairprogrammers.isbntools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.virtualpairprogrammer.isbntools.Book;
import com.virtualpairprogrammer.isbntools.ExternalISBNDataService;
import com.virtualpairprogrammer.isbntools.StockManager;

class StockManagementTests {

	@Test
	void testCanGetCorrectLocatorCode() 
	{
		ExternalISBNDataService testService = new ExternalISBNDataService() {
			
			@Override
			public Book lookup( String isbn )
			{
				return new Book( isbn, "Of Mice And Men", "J, Steinbeck" );
			}
		};
		
		
		StockManager stockManager = new StockManager();
		stockManager.setService(testService);
		
		String isbn = "0140177396";
		String locatorCode = stockManager.getLocatorCode(isbn);
		assertEquals( "7396J4", locatorCode );		
	}

}
