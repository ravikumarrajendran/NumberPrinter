package com.app.numberprinter.service;

/**
 * NumberToRoman is the Interface used. 
 * to providing some functionality. 
 * to converting Number to Roman Numerals. 
 * @author Ravikumar
 *
 */
public interface NumberToRoman {
	/**
	 * To convert number to Roman numerals.
	 * @param number as input for converting number to Roman Numerals.
	 * @return string. 
	 */
	public String convertToRoman(int number);
}
