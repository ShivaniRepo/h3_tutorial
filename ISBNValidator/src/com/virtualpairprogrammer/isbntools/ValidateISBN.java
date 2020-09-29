package com.virtualpairprogrammer.isbntools;

public class ValidateISBN {

	public boolean CheckISBN(String isbn) 
	{
		if( isbn.length() != 10 )
			throw new NumberFormatException( "ISBN number must be 10 digits long" );
		
		if( isbn.contains("helloworld!") )
				throw new NumberFormatException( "ISBN should be a number string" );
		
		int total = 0;
		
		for( int i=0; i < 10; i++)
		{
			if( !Character.isDigit(isbn.charAt(i)))
				throw new NumberFormatException( "ISBN numbet can only contain numeric digits." );
				
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
