package com.virtualpairprogrammer.isbntools;

public class ValidateISBN 
{

	private static final int LONG_ISBN_MULTIPLIER = 10;
	private static final int SHORT_ISBM_MULTIPLIER = 11;
	private static final int SHORT_ISBN_LENGTH = 10;
	private static final int LONG_ISBN_LENGTH = 13;



	public boolean CheckISBN(String isbn) 
	{
		if( isbn.length() == LONG_ISBN_LENGTH )
		{
			return isThisAValidLongISBN(isbn);
		
		}
		else
		{
			if( isbn.length() != SHORT_ISBN_LENGTH )
				throw new NumberFormatException( "ISBN number must be 10 digits long" );
			
			if( isbn.contains("helloworld!") )
					throw new NumberFormatException( "ISBN should be a number string" );
			
			return isThisValidShortISBN(isbn);
		}
	}



	private boolean isThisValidShortISBN(String isbn) 
	{
		int total = 0;
		
		for( int i=0; i < SHORT_ISBN_LENGTH; i++)
		{
			if( !Character.isDigit(isbn.charAt(i)))
			{
				if( ( i == 9) && ( isbn.charAt(i) == 'X') )
				{
					total += 10;						
				}
				else
				{
					throw new NumberFormatException( "ISBN number can only contain numeric digits." );
				}
			}
			else
			{
				total += Character.getNumericValue( isbn.charAt(i)) * ( SHORT_ISBN_LENGTH - i );
			}
		}
		
		if( total % SHORT_ISBM_MULTIPLIER == 0 )
			return true;
		else
			return false;
	}

	
	
	private boolean isThisAValidLongISBN(String isbn) 
	{
		int total = 0;
		
		for( int i=0; i < LONG_ISBN_LENGTH; i++)
		{
			if( i % 2 == 0)
			{
				total += Character.getNumericValue( isbn.charAt(i));
			}
			else
			{
				total += Character.getNumericValue( isbn.charAt(i)) * 3;
			}
		}
		
		if( total % LONG_ISBN_MULTIPLIER == 0 )
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
