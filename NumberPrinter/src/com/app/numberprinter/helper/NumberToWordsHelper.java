package com.app.numberprinter.helper;

import com.app.numberprinter.constant.NumberPrinterConstant;

/**
 * NumberToWordsHelper is the Helper class. 
 * used to assist in providing some functionality.
 * to converting Number to words. 
 * @author Ravikumar
 *
 */
public class NumberToWordsHelper {
	
	/**
	 * private constructor.
	 */
	private NumberToWordsHelper(){
	}
	
	/**
	 * To convert number to words.
	 * @param Number as input for converting number to words up to hundreds.
	 * @return string. 
	 */
	 public static String getConvertUptoHundreds(int number) {
	        String current;
	        
	        if (number % 100 < 20){
	            current = NumberPrinterConstant.NUMBERS[number % 100];
	            number /= 100;
	        }
	        else {
	            current = NumberPrinterConstant.NUMBERS[number % 10];
	            number /= 10;
	            
	            current = NumberPrinterConstant.TENS[number % 10] + current;
	            number /= 10;
	        }
	        if (number == 0) return current;
	        return NumberPrinterConstant.NUMBERS[number] + NumberPrinterConstant.HUNDRED + current;
	    }

}
