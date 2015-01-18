package com.app.numberprinter.helper;

import java.util.Iterator;
import java.util.Set;

import com.app.numberprinter.constant.NumberPrinterConstant;
/**
 * NumberToRomanHelper is the Helper class used to assist in providing some functionality to converting Number to Roman Numerals. 
 * @author Ravikumar.
 *
 */
public class NumberToRomanHelper {
	/**
	 * To get the Key. 
	 * @param Number as input for converting number to words.
	 * @return string. 
	 */
	 public static int getRomanInteger(int number) {
	        Set<Integer> keySet = NumberPrinterConstant.romanValues.keySet();
	        Iterator<Integer> iter = keySet.iterator();
	        int prevValue = 0;
	        while (iter.hasNext()) {
	            Integer value = iter.next();
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
	 public static  String getRomanNumerals(int number) {
	        String s = NumberPrinterConstant.romanValues.get(number);
	        return (s == null) ? "" : s;
	    }

}
