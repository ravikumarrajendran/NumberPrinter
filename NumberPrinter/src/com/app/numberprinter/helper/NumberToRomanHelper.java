package com.app.numberprinter.helper;

import java.util.Iterator;
import java.util.Set;

import com.app.numberprinter.constant.NumberPrinterConstant;
/**
 * NumberToRomanHelper is the Helper class.  
 * used to assist in providing some functionality. 
 * to converting Number to Roman Numerals. 
 * @author Ravikumar.
 *
 */
public final class NumberToRomanHelper {
	
	/**
	 * private constructor.
	 */
	private NumberToRomanHelper(){	
	}
	/**
	 * To get the Key. 
	 * @param Number as input for converting number to words.
	 * @return string. 
	 */
	 public static int getRomanInteger(final int number) {
	        final Set<Integer> keySet = NumberPrinterConstant.romanValues.keySet();
	        final Iterator<Integer> iterator = keySet.iterator();
	        int prevValue = 0;
	        while (iterator.hasNext()) {
	            final Integer value = iterator.next();
	            if (value > number) {
	                return prevValue;
	            } else {
	                prevValue = value;
	            }
	        }
	        return prevValue;
	    }
	 
	 
	/**
	 * To get the Roman value.
	 * @param number.
	 * @return string.
	 */
	 public static  String getRomanNumerals(final int number) {
	        String romanNumerals = NumberPrinterConstant.romanValues.get(number);
	        return (romanNumerals == null) ? "" : romanNumerals;
	    }

}
