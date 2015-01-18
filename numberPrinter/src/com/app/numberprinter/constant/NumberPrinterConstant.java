package com.app.numberprinter.constant;

import java.util.Map;
import java.util.TreeMap;

/**
 * NumberPrinterConstant is the constant file .
 * 
 * @author ravikumar.
 *
 */
public final class NumberPrinterConstant {

	
	/**
	 *  To Initialize the Roman Letters.
	 */
	public static Map<Integer, String> romanValues = null;
	static {
		romanValues = new TreeMap<Integer, String>();

		romanValues.put(1, "I");
		romanValues.put(4, "IV");
		romanValues.put(5, "V");
		romanValues.put(9, "IX");
		romanValues.put(10, "X");
		romanValues.put(40, "XL");
		romanValues.put(50, "L");
		romanValues.put(90, "XC");
		romanValues.put(100, "C");
		romanValues.put(400, "CD");
		romanValues.put(500, "D");
		romanValues.put(900, "CM");
		romanValues.put(1000, "M");
	}
	
	public static final String ROMAN="ROMAN";
	
	public static final String WORDS="WORDS";
	public static final String[] Thousands = {
        "",
        " Thousand"
       
    };
    
	public static final String[] Tens = {
        "",
        " Ten",
        " Twenty",
        " Thirty",
        " Fourty",
        " Fifty",
        " Sixty",
        " Seventy",
        " Eighty",
        " Ninety"
    };
    
	public static final String[] Numbers = {
        "",
        " One",
        " Two",
        " Three",
        " Four",
        " Five",
        " Six",
        " Seven",
        " Eight",
        " Nine",
        " Ten",
        " Eleven",
        " Twelve",
        " Thirteen",
        " Fourteen",
        " Fifteen",
        " Sixteen",
        " Seventeen",
        " Eighteen",
        " Nineteen"
    };

	
	public static Map<Integer, String> formatValues = null;
	static {
		formatValues = new TreeMap<Integer, String>();

		formatValues.put(1, "ROMAN");
		formatValues.put(2, "WORDS");
		
	}
	
	public static final String PRESS_Y="Press[Y] for Conversion";
	public static final String YES_FLAG="y";
	public static final String OUTPUT_FORMAT="Enter Type of Output Format : 1 ---> ROMAN or 2 ---> WORDS";
	public static final String NUMBER_RANGE="Please Enter Number Between 1 to 3999";
	public static final String ENTERED_VALUES="You entered : ";
	public static final String BUSINESS_RULE_FOR_NUMBER_RANGE="The Solution is Only Required To Convert Numbers in the Range 1 - 3999";
	public static final String VALID_INPUT_FORMAT="Enter Valid Format/Only Numbers Are Allowed";
	public static final String TO_CONTINUE="To Continue Conversion Press[Y]";
	public static final String THANK_YOU="Thank you";
	public static final String HUNDRED=" Hundred";
	
}
