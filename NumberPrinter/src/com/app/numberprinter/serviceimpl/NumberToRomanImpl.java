package com.app.numberprinter.serviceimpl;

import com.app.numberprinter.helper.NumberToRomanHelper;
import com.app.numberprinter.service.NumberToRoman;

/**
 * NumberToRomanImpl is the class used.
 * to providing some functionality.
 * to converting Number to Roman Numerals. 
 * @author Ravikumar
 *
 */
public class NumberToRomanImpl implements NumberToRoman{

	/**
	 * To convert number to Roman numerals.
	 * @param Number as input for converting number to Roman Numerals.
	 * @return string. 
	 */
	public String convertToRoman(int number) {
		final StringBuilder romanNumerals = new StringBuilder();
        while(number > 0) {
            final int value = NumberToRomanHelper.getRomanInteger(number);
            romanNumerals.append(NumberToRomanHelper.getRomanNumerals(value));
            number -= value;
        }
        return romanNumerals.toString();
	}

}
