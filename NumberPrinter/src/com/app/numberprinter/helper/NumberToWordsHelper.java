package com.app.numberprinter.helper;

import com.app.numberprinter.constant.NumberPrinterConstant;

/**
 * NumberToWordsHelper is the Helper class used to assist in providing some functionality to converting Number to words. 
 * @author Ravikumar
 *
 */
public class NumberToWordsHelper {
	
	/**
	 * 
	 * @param Number as input for converting number to words up to hundreds.
	 * @return string. 
	 */
	 public static String getConvertUptoHundreds(int number) {
	        String current;
	        
	        if (number % 100 < 20){
	            current = NumberPrinterConstant.Numbers[number % 100];
	            number /= 100;
	        }
	        else {
	            current = NumberPrinterConstant.Numbers[number % 10];
	            number /= 10;
	            
	            current = NumberPrinterConstant.Tens[number % 10] + current;
	            number /= 10;
	        }
	        if (number == 0) return current;
	        return NumberPrinterConstant.Numbers[number] + NumberPrinterConstant.HUNDRED + current;
	    }

}
