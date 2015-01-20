/**
 * 
 */
package com.app.numberprinter.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.app.numberprinter.mainprogram.NumberPrinter;
import com.app.numberprinter.serviceimpl.NumberToRomanImpl;
import com.app.numberprinter.serviceimpl.NumberToWordsImpl;

/**
 * @author Ravikumar
 *
 */
public class TestNumberPrinter {
	
	/**
	 * To check the convertNumberToWords method returns value.
	 */
	@Test
	public void testNumbertoWordsNotNull() {
		NumberToWordsImpl numberToWordsImpl = new NumberToWordsImpl();
		assertNotNull(numberToWordsImpl.convertNumberToWords(56));
		
	}
	/**
	 * To check the convertNumberToWords method returns null.
	 */
	@Ignore
	@Test
	public void testNumbertoWordsNull() {
		NumberToWordsImpl numberToWordsImpl = new NumberToWordsImpl();
		assertNull(numberToWordsImpl.convertNumberToWords(1456));
		
	}
	
	/**
	 * To check the convertNumberToWords method value is Equal.
	 */
	@Test
	public void testNumbertoWordsEqual() {
		 NumberToWordsImpl numberToWordsImpl = new NumberToWordsImpl();
		 assertEquals("Must Be Equal", "One", numberToWordsImpl.convertNumberToWords(1));
		
	}
	
	/**
	 * To check the convertNumberToWords method value is NotEqual.
	 */
	@Test
	public void testNumbertoWordsNotEqual() {
		NumberToWordsImpl numberToWordsImpl = new NumberToWordsImpl();
		 assertNotEquals("Must Be Not Equal", "One", numberToWordsImpl.convertNumberToWords(0));
		
	}
	/**
	 * To check the convertToRoman method returns value.
	 */
	@Test
	public void testNumberToRomanNotNull() {
		NumberToRomanImpl numberToRomanImpl = new NumberToRomanImpl();
		assertNotNull(numberToRomanImpl.convertToRoman(6));
		
	}
	/**
	 * To check the convertToRoman method returns null.
	 */
	@Ignore
	@Test
	public void testNumberToRomanNull() {
		
		NumberToRomanImpl numberToRomanImpl = new NumberToRomanImpl();
		assertNull(numberToRomanImpl.convertToRoman(1745));
		
	}
	/**
	 * To check the convertToRoman method value is Equal.
	 */
	@Test
	public void testNumberToRomanEqual() {
		 NumberToRomanImpl numberToRomanImpl = new NumberToRomanImpl();
		 assertEquals("Must Be Equal", "CMXCIX", numberToRomanImpl.convertToRoman(999));
		
	}
	/**
	 * To check the convertToRoman method value is NotEqual.
	 */
	@Test
	public void testNumberToRomanNotEqual() {
	     NumberToRomanImpl numberToRomanImpl = new NumberToRomanImpl();
		 assertNotEquals("Must Be Not Equal", "IV", numberToRomanImpl.convertToRoman(5));
		
	}
	
	
	
}
