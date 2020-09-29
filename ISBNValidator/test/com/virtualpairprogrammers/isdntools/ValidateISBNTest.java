package com.virtualpairprogrammers.isdntools;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.virtualpairprogrammer.isbntools.ValidateISBN;

class ValidateISBNTest {
	
	@Test
	public void CheckAValidISBN()
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
	public void CheckAnInvalidISBN()
	{
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.CheckISBN( "0140449117" );
		//fail();
		assertFalse(result);
	}

	
	

	//@Test
	//void test() {
	//	fail("Not yet implemented");
	//}

	//@Test
	//void test() {
		
	//}

}
