package com.virtualpairprogrammers.isdntools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.virtualpairprogrammer.isbntools.ValidateISBN;

class ValidateISBNTest {
	
	@Test
	public void CheckAValidISBN()
	{
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.CheckISBN( 140449116 );
		assertTrue(result);
	}

	//@Test
	//void test() {
	//	fail("Not yet implemented");
	//}

	//@Test
	//void test() {
		
	//}

}
