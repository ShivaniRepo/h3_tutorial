package com.virtualpairprogrammers.isdntools;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.virtualpairprogrammer.isbntools.ValidateISBN;

class ValidateISBNTest {
	
	@Test
	public void CheckAValid10DigitISBN()
	{
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.CheckISBN( "0140449116" );
		//assertTrue(result);
		assertTrue("first value", result);
		
		result = validator.CheckISBN("0140177396" );
		//assertTrue(result);
		assertTrue("second value", result);
	}
	
	
	@Test
	public void CheckAValid13DigitISBN()
	{
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.CheckISBN( "9781853260087" );
		assertTrue("first value", result);
		
		result = validator.CheckISBN( "9781853267338" );
		assertTrue("second value", result);

	}
	
	
	@Test
	public void TenDigitISBNNumbersEndingInAnXAreValid()
	{
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.CheckISBN( "012000030X" );
		assertTrue(result);
	}
	
	@Test
	public void CheckAnInvalid10DigitISBN()
	{
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.CheckISBN( "0140449117" );
		//fail();
		assertFalse(result);
	}

	@Test
	public void CheckAnInvalid13DigitISBN()
	{
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.CheckISBN( "9781853267336" );
		
		assertFalse(result);
	}

	
	
	//This implies that if this exception is thrown the test will pass else the test will fail.
	//@Test( expected = NumberFormatException.class ) //tThis is for JUnit4
	@Test
	public void nineDigitISBNAreNotAllowed()
	{
		ValidateISBN validator = new ValidateISBN();
		Assertions.assertThrows(NumberFormatException.class, () -> {
			boolean result = validator.CheckISBN( "123456789" );
		});
	}
	
	
	@Test
	public void nonNumericISBNAreNotAllowed()
	{
		ValidateISBN validator = new ValidateISBN();
		
		Assertions.assertThrows(NumberFormatException.class, () -> {
			boolean result = validator.CheckISBN( "helloworld!" );
		});
	}

	
	//@Test
	//void test() {
	//	fail("Not yet implemented");
	//}

	//@Test
	//void test() {
		
	//}

}
