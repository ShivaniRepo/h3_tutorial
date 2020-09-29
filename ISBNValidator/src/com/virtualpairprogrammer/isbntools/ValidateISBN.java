package com.virtualpairprogrammer.isbntools;

public class ValidateISBN {

	public boolean CheckISBN(String isbn) {
		int total = 0;
		
		for( int i=0; i < 10; i++)
		{
			total += isbn.charAt(i) * ( 10 - i );
		}
		
		if( total % 11 == 0 )
			return true;
		else
			return false;
	}


//	public boolean CheckISBN(String isbn) {
//		if( isbn == "0140449116") {
//			return true;
//		}
//		return false;
//	}
}
