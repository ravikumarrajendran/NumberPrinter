package com.app.numberprinter.serviceimpl;

import com.app.numberprinter.helper.NumberToRomanHelper;
import com.app.numberprinter.service.NumberToRoman;

/**
 * NumberToRomanImpl is the class used to providing some functionality to converting Number to Roman Numerals. 
 * @author Ravikumar
 *
 */
public class NumberToRomanImpl implements NumberToRoman{

	/**
	 * To convert number to Roman numerals.
	 * @param Number as input for converting number to Roman Numerals.
	 * @return string. 
	 */
	public String convertToRoman(int Number) {
		StringBuilder romanNumerals = new StringBuilder();
        while(Number > 0) {
            int value = NumberToRomanHelper.getRomanInteger(Number);
            romanNumerals.append(NumberToRomanHelper.getRomanNumerals(value));
            Number -= value;
        }
        return romanNumerals.toString();
	}

}
